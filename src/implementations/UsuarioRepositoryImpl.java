/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Usuario;
import java.util.ArrayList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
import persistence.UsuarioRepository;

public class UsuarioRepositoryImpl implements UsuarioRepository {

    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/faceboot");
    CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).codecRegistry(codecRegistry).build();
    MongoClient mongoClient = MongoClients.create(clientSettings);
    MongoDatabase database = mongoClient.getDatabase("faceboot");
    MongoCollection<Usuario> usuarios = database.getCollection("usuarios", Usuario.class);

    @Override
    public Usuario find(ObjectId id) {
        FindIterable<Usuario> fi = usuarios.find(eq("_id", id));
        return fi.first();
    }

    @Override
    public void update(Usuario usuario) {
        usuarios.replaceOne(eq("_id",new ObjectId(usuario.getId().toString())),usuario);
    }

    @Override
    public void delete(Usuario entity) {
        usuarios.deleteOne(eq("_id",new ObjectId(entity.getId().toString())));
    }

    @Override
    public void commit(Usuario usuario) {
            usuarios.insertOne(usuario);
    }

    @Override
    public ArrayList<Usuario> getAll() {
        ArrayList<Usuario> lista = new ArrayList<>();

        
        FindIterable<Usuario> users = usuarios.find();

        for (Usuario nombre : users) {
            lista.add(nombre);
        }
     
        return lista;

    }

}
