package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.ebean.ExpressionList;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.*;
import validators.StringIsUrl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;


//Modelo para los libros de Recetas relacion N a M con Autores
@Entity
public class LibroReceta extends Model {
    public static final Finder<Long,LibroReceta> find = new Finder<>(LibroReceta.class);

    public static LibroReceta findCategoryByName(String name) {
        return find.query().where().eq("name", name).findOne();
    }

    @Id
    private Long id;

    @Required
    private String nombre;

    //Usamos nuetro validador Custom
    @StringIsUrl
    private String web;

    @ManyToMany(mappedBy = "libroRecetas")
    @JsonBackReference
    private List<Autor> autores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public static LibroReceta findById(Long id) {
        return find.byId(id);
    }

    public static LibroReceta findByName(String nombre) {
        // API Fluent
        ExpressionList<LibroReceta> query = find.query().where().eq("nombre", nombre);
        LibroReceta libroReceta = query.findOne();

        return libroReceta;
    }

    public static List<LibroReceta> findAll() {

        return find.query().findList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
