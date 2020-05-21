
package persistence;

import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author carls
 * @param <T>
 */
public interface Repository<T> {

    T find(ObjectId id);

    void update(T entity);

    void delete(T entity);

    void commit(T entity);


    ArrayList<ArrayList> getAll();
    
    

}
