package implementations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Post;
import entidades.Usuario;
import java.util.ArrayList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
import persistence.PostRepository;

public class PostRepositoryImpl implements PostRepository {

    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/faceboot");
    CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).codecRegistry(codecRegistry).build();
    MongoClient mongoClient = MongoClients.create(clientSettings);
    MongoDatabase database = mongoClient.getDatabase("faceboot");
    MongoCollection<Post> posts = database.getCollection("posts", Post.class);
    MongoCollection<Usuario> usuarios = database.getCollection("usuarios", Usuario.class);

    @Override
    public Post find(ObjectId id) {
        FindIterable<Post> fi = posts.find(eq("_id", id));
        return fi.first();
    }

    @Override
    public void update(Post post) {
        posts.replaceOne(eq("_id", new ObjectId(post.getId().toString())), post);
    }

    @Override
    public void delete(Post post) {
        posts.deleteOne(eq("_id", new ObjectId(post.getId().toString())));
    }

    @Override
    public void commit(Post post) {

        posts.insertOne(post);
    }

    @Override
    public ArrayList<Post> getAll() {
        ArrayList<Post> lista = new ArrayList<>();

        FindIterable<Post> psts = posts.find();

        for (Post nombre : psts) {
            lista.add(nombre);
        }

        return lista;
    }

    @Override
    public ArrayList<Post> getAllFromUser(Usuario usuario) {
        ArrayList<Post> lista = new ArrayList<>();

        FindIterable<Post> psts = posts.find(eq("usuario", usuario.getId()));
        for (Post post : psts) {
            lista.add(post);
        }
        return lista;
    }

    @Override
    public ArrayList<Post> getAllWithTag(String tag) {
        ArrayList<Post> lista = new ArrayList<>();

        FindIterable<Post> psts = posts.find();
        for (Post post : psts) {
            if(post.getTags().contains(tag))
            lista.add(post);
        }
        return lista;
    }

}
