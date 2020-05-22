/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entidades.Post;
import entidades.Usuario;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author carls
 */
public interface PostRepository extends Repository<Post> {

    @Override
    public Post find(ObjectId id);

    @Override
    public void update(Post entity);

    @Override
    public void delete(Post entity);

    @Override
    public void commit(Post entity);

    @Override
    public ArrayList<Post> getAll();
    
    public ArrayList<Post> getAllFromUser(Usuario user);
    
    public ArrayList<Post> getAllWithTag(String tag);
}
