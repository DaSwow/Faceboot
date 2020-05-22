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
import entidades.Comentario;
import entidades.Post;
import entidades.Usuario;
import java.util.ArrayList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
import persistence.ComentarioRepository;
import persistence.PostRepository;
import persistence.UsuarioRepository;

public class ComentarioRepositoryImpl implements ComentarioRepository {

    ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/faceboot");
    CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).codecRegistry(codecRegistry).build();
    MongoClient mongoClient = MongoClients.create(clientSettings);
    MongoDatabase database = mongoClient.getDatabase("faceboot");
    MongoCollection<Post> posts = database.getCollection("posts", Post.class);
    MongoCollection<Usuario> usuarios = database.getCollection("usuarios", Usuario.class);
    MongoCollection<Comentario> comentarios = database.getCollection("comentarios", Comentario.class);

    @Override
    public Comentario find(ObjectId id) {
        FindIterable<Comentario> fi = comentarios.find(eq("_id", id));
        return fi.first();
    }

    @Override
    public void update(Comentario comentario) {
        comentarios.replaceOne(eq("_id", new ObjectId(comentario.getId().toString())), comentario);
    }

    @Override
    public void delete(Comentario comentario) {
        comentarios.deleteOne(eq("_id", new ObjectId(comentario.getId().toString())));

        UsuarioRepository ru = new UsuarioRepositoryImpl();
        PostRepository rp = new PostRepositoryImpl();

        Usuario usuario = ru.find(comentario.getAutor());
        ArrayList<Comentario> cmts = usuario.getComentarios();
        for (Comentario cmt : cmts) {
            if (cmt.getId().equals(comentario.getId())) {
                cmts.remove(cmt);
                break;
            }
        }
        ru.update(usuario);

        Post post = rp.find(comentario.getPostComentado());

        rp.update(post);
        ArrayList<Comentario> cmts2 = post.getComentarios();
        for (Comentario cmt : cmts2) {
            if (cmt.getId().equals(comentario.getId())) {
                cmts2.remove(cmt);
                break;
            }
        }
        rp.update(post);

    }

    @Override
    public void commit(Comentario comentario) {
        comentarios.insertOne(comentario);
    }

    @Override
    public ArrayList<Comentario> getAll() {
        ArrayList<Comentario> lista = new ArrayList<>();

        FindIterable<Comentario> cmtrs = comentarios.find();

        for (Comentario nombre : cmtrs) {
            lista.add(nombre);
        }

        return lista;
    }

    @Override
    public ArrayList<Comentario> getAllFromPost(Post post) {
        ArrayList<Comentario> lista = new ArrayList<>();

        FindIterable<Comentario> cmts = comentarios.find(eq("post", post.getId()));

        for (Comentario nombre : cmts) {
            lista.add(nombre);
        }

        return lista;
    }

}
