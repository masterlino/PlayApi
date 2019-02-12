package models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.ebean.ExpressionList;
import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

//El ingrediente Receta es un modelo especial donde ademas del ingrediente tenemos un campo Cantidad Relacion N a 1 con Receta
@Entity
public class IngredienteR extends Model {

    public static final Finder<Long, IngredienteR> find = new Finder<>(IngredienteR.class);

    @Id
    private Long id;

    @Required
    private  String nombre;

    private String cantidad;

    @ManyToOne
    @JsonBackReference
    private Receta receta;

    public IngredienteR() {
        super();
    }

    public IngredienteR(String nombre, String cantidad) {
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
    }


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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public static IngredienteR findById(Long id) {
        return find.byId(id);
    }

    public static IngredienteR findByName(String nombre) {
        // API Fluent
        ExpressionList<IngredienteR> query = find.query().where().eq("nombre", nombre);
        IngredienteR ingrediente = query.findOne();

        return ingrediente;
    }

    public static List<IngredienteR> findAll() {

        return find.query().findList();
    }


    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}
