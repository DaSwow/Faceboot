
package persistence;


import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;


public interface DocumentoRepository extends Repository<Document>{
    
      @Override
    Document find(ObjectId id);

    @Override
    void update(Document entity);

    @Override
    void delete(Document entity);

    @Override
    void commit(Document entity);

    @Override
    ArrayList<ArrayList> getAll();
    
     public MongoCollection<Document> getCollection();

    public void setCollection(MongoCollection<Document> collection);
    
}
