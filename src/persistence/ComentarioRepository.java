
package persistence;

import entidades.Comentario;
import entidades.Post;
import java.util.ArrayList;
import org.bson.types.ObjectId;


public interface ComentarioRepository extends Repository<Comentario>{
    
     @Override
    public Comentario find(ObjectId id);

    @Override
    public void update(Comentario comentario);

    @Override
    public void delete(Comentario comentario);

    @Override
    public void commit(Comentario comentario);

    @Override
    public ArrayList<Comentario> getAll();
    
    public ArrayList<Comentario> getAllFromPost(Post post);
    
    
}
