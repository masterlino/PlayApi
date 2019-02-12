package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.ExpressionList;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.*;
import play.data.validation.ValidationError;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

//Modelo de autores relacion N a M con Libro Recetas y 1 a N con Recetas
@Entity
public class Autor extends Model {

    public static final Finder<Long,Autor> find = new Finder<>(Autor.class);

    @Id
    private Long id;

    @Required(message = "author-name-required")
    private  String nombre;

    @Min(message = "author-age-toolow", value = 3) @Max(message = "author-age-toohigh", value=200)
    private Integer edad;

    @OneToMany(cascade= CascadeType.ALL, mappedBy="autor")
    @JsonBackReference
    private List<Receta> recetas;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    @Valid
    private List<LibroReceta> libroRecetas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public static Autor findById(Long id) {
        return find.byId(id);
    }

    public static Autor findByName(String nombre) {
        // API Fluent
        ExpressionList<Autor> query = find.query().where().eq("nombre", nombre);
        Autor autor = query.findOne();

        return autor;
    }

    public static List<Autor> findAll() {
        // API Fluent
        /*ExpressionList<Autor> query = find.query();
        List<Autor> autores = query.findList();

        return autores;*/
        return find.query().findList();
    }


    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public List<LibroReceta> getLibroRecetas() {
        return libroRecetas;
    }

    public void setLibroRecetas(List<LibroReceta> libroRecetas) {
        this.libroRecetas = libroRecetas;
    }


    //validar que el libro de recetas no puede estar creado sin tener ningun elemento
    public List<ValidationError> validate() {
        List<ValidationError> errores = new ArrayList<>();

        if (libroRecetas != null && libroRecetas.size() == 0) {
            errores.add(new ValidationError("libroRecetas", "recipe-book-empty"));
        }

        return errores;
    }
}
