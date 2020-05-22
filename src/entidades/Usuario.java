package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Usuario {

    @BsonProperty("_id")
    private ObjectId id;

    @BsonProperty("nombre")
    private String nombre;

    @BsonProperty("edad")
    private Integer edad;

    @BsonProperty("sexo")
    private String sexo;

    @BsonProperty("fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @BsonProperty("generos_musicales_favoritos")
    private ArrayList<String> generosMusicales = new ArrayList();

    @BsonProperty("peliculas_favoritas")
    private ArrayList<String> peliculasFavoritas = new ArrayList();

    @BsonProperty("posts")
    private ArrayList<String> posts = new ArrayList();

    @BsonProperty("comentarios")
    private ArrayList<Comentario> comentarios = new ArrayList();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Collection<String> getGenerosMusicales() {
        return generosMusicales;
    }

    public void setGenerosMusicales(ArrayList<String> generosMusicales) {
        this.generosMusicales = generosMusicales;
    }

    public Collection<String> getPeliculasFavoritas() {
        return peliculasFavoritas;
    }

    public void setPeliculasFavoritas(ArrayList<String> peliculasFavoritas) {
        this.peliculasFavoritas = peliculasFavoritas;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    

}
