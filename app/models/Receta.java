package models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.ebean.ExpressionList;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.*;

import javax.persistence.*;
import java.util.List;

//Modelo Receta Relacion N a 1 con Autor y 1 a N con IngredientesR
@Entity
public class Receta extends Model {

    public static final Finder<Long,Receta> find = new Finder<>(Receta.class);

    @Id
    private Long id;

    @ManyToOne
    @JsonManagedReference
    private Autor autor;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="receta")
    @JsonManagedReference
    private List<IngredienteR> ingredientes;

    @Required
    private String titulo;

    @Required
    private String Preparacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<IngredienteR> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteR> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(IngredienteR ingredienteR) {
        this.ingredientes.add(ingredienteR);
        ingredienteR.setReceta(this);
    }

    public static Receta findById(Long id) {
        return find.byId(id);
    }

    public static Receta findByName(String nombre) {
        // API Fluent
        ExpressionList<Receta> query = find.query().where().eq("titulo", nombre);
        Receta receta = query.findOne();

        return receta;
    }

    public static List<Receta> findAllWithAuthor(Autor autor){


        ExpressionList<Receta> query = find.query().where().eq("autor", autor);
        List<Receta> recetas = query.findList();

        return recetas;
    }


    public String getPreparacion() {
        return Preparacion;
    }

    public void setPreparacion(String preparacion) {
        Preparacion = preparacion;
    }
}
