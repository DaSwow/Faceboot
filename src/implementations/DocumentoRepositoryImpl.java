package implementations;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import static javafx.scene.Cursor.cursor;
import org.bson.Document;
import org.bson.types.ObjectId;
import persistence.DocumentoRepository;

public class DocumentoRepositoryImpl implements DocumentoRepository {

    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;
    String coleccion;

    public DocumentoRepositoryImpl(String coleccion) {
        this.coleccion = coleccion;
        mongoClient = MongoClients.create("mongodb://localhost:27017/faceboot");
        database = this.mongoClient.getDatabase("faceboot");
        collection = database.getCollection(this.coleccion, Document.class);

    }

    @Override
    public ArrayList<ArrayList> getAll() {
        ArrayList<ArrayList> lista = new ArrayList<>();
        switch (coleccion) {
            case "usuarios":

                ArrayList<String> listaNombres = new ArrayList<>();
                ArrayList<Integer> listaEdades = new ArrayList<>();
                ArrayList<String> listaSexos = new ArrayList<>();
                ArrayList<String> listaFechas = new ArrayList<>();
                ArrayList<ObjectId> listaIds = new ArrayList<>();
                FindIterable<Document> nombres = collection.find().projection(fields(include("nombre")));
                ;
                FindIterable<Document> edades = collection.find().projection(fields(include("edad")));
                ;
                FindIterable<Document> sexos = collection.find().projection(fields(include("sexo")));
                ;
                FindIterable<Document> fechas = collection.find().projection(fields(include("fecha_nacimiento")));
                ;
                FindIterable<Document> ids = collection.find().projection(fields(include("_id")));
                ;
                for (Document nombre : nombres) {
                    listaNombres.add(nombre.getString("nombre"));
                }
                for (Document edad : edades) {

                    listaEdades.add(edad.getInteger("edad"));
                }
                for (Document sexo : sexos) {
                    listaSexos.add(sexo.getString("sexo"));
                }
                for (Document fecha : fechas) {
                    String dt = fecha.getString("fecha_nacimiento");

                    listaFechas.add(dt);
                }
                for (Document id : ids) {
                    listaIds.add(id.getObjectId("_id"));
//id.getObjectId("_id"));
                }

                lista.add(listaNombres);
                lista.add(listaEdades);
                lista.add(listaSexos);
                lista.add(listaFechas);
                lista.add(listaIds);
        }

        //        MongoCursor<Document> cursor = collection.find().iterator();
//        try {
//            while (cursor.hasNext()) {
//                lista.add(cursor.next().toJson());
//            }
//        } finally {
//            cursor.close();
//        }
        return lista;
    }

    @Override
    public Document find(ObjectId id) {

        FindIterable<Document> fi = collection.find(eq("_id", id));

        return fi.first();
    }

    @Override
    public void update(Document entity) {

        FindIterable<Document> ids = collection.find();

        Document documento = new Document().append("_id", new ObjectId(entity.get("_id", ObjectId.class).toString()))
                .append("nombre", entity.getString("nombre"))
                .append("edad", entity.getInteger("edad"))
                .append("sexo", entity.getString("sexo"))
                .append("fecha_nacimiento", entity.getString("fecha_nacimiento"))
                .append("generos_musicales_favoritos", entity.getList("generos_musicales_favoritos", String.class))
                .append("peliculas_favoritas", entity.getList("peliculas_favoritas", String.class));
        System.out.println("");

        for (Document id : ids) {

            if (id.getObjectId("_id").toString().equalsIgnoreCase(new ObjectId(entity.get("_id").toString()).toString())) {
                BasicDBObject theQuery = new BasicDBObject();
                theQuery.put("_id", new ObjectId(entity.getObjectId("_id").toString()));
                 collection.deleteMany(theQuery);

                collection.insertOne(documento);
                break;
            }

        }

    }

    @Override
    public void delete(Document entity) {
         FindIterable<Document> ids = collection.find();
         
         
         
        for (Document id : ids) {

            if (id.getObjectId("_id").toString().equalsIgnoreCase(new ObjectId(entity.get("_id").toString()).toString())) {
                BasicDBObject theQuery = new BasicDBObject();
                theQuery.put("_id", new ObjectId(entity.getObjectId("_id").toString()));
                 collection.deleteMany(theQuery);

           
                break;
            }

        }
        
        
       
    }

    @Override
    public void commit(Document entity) {
        collection.insertOne(entity);

    }

    @Override
    public MongoCollection<Document> getCollection() {
        return collection;
    }

    @Override
    public void setCollection(MongoCollection<Document> collection) {
        this.collection = collection;
    }
}
