package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author carls
 */
public class Comentario {

    @BsonProperty("_id")
    private ObjectId id;
    @BsonProperty("autor")
    private ObjectId autor;
    @BsonProperty("comentario")
    private String comentario;
    @BsonProperty("fecha")
    private LocalDate Fecha;
    @BsonProperty("hora")
    private LocalTime hora;
    @BsonProperty("post_comentado")
    private ObjectId postComentado;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getAutor() {
        return autor;
    }

    public void setAutor(ObjectId autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public ObjectId getPostComentado() {
        return postComentado;
    }

    public void setPostComentado(ObjectId postComentado) {
        this.postComentado = postComentado;
    }

    
    
}
