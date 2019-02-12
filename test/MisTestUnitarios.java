import models.Autor;
import models.IngredienteR;
import models.Receta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MisTestUnitarios {

    @Before
    public void insercionDeValoresDummie() {
        Autor autor = new Autor();
        autor.setNombre("Ñ");
        autor.setEdad(31);
        autor.save();

        IngredienteR ingrediente = new IngredienteR();
        ingrediente.setNombre("Ñ");
        ingrediente.setCantidad("Ñ");
        ingrediente.save();
        IngredienteR ingrediente2 = new IngredienteR();
        ingrediente2.setNombre("Ñ");
        ingrediente2.setCantidad("Ñ");
        ingrediente2.save();

        List<IngredienteR> ingredientes = new ArrayList<IngredienteR>();

        Receta receta = new Receta();
        receta.setTitulo("Ñ");
        receta.setAutor(autor);
        receta.setIngredientes(ingredientes);
        receta.save();

    }

    @Test
    public void PodemoGuardarNombresConEnies() {
        Autor autor = Autor.findByName("Ñ");

        String nombre = autor.getNombre();
        char caracterEnie = nombre.charAt(0);
        assertEquals('Ñ', caracterEnie);
    }

    @Test
    public void PodemoConcatenarNombres() {
        Autor autor = Autor.findByName("Ñ");
        Autor autor2 = Autor.findByName("Ñ");

        String nombre = autor.getNombre() + autor2.getNombre();
        assertEquals("ÑN", nombre);
    }

    @Test
    public void LaEdadDeAutorEsInteger() {
        Autor autor = Autor.findByName("Ñ");

        assertTrue( autor.getEdad() instanceof Integer);
    }

    @Test
    public void LaCantidadDeIngredieteEsString() {
        IngredienteR ingrediente = IngredienteR.findByName("Ñ");

        assertTrue( ingrediente.getCantidad() instanceof String );
    }


    @After
    public void eliminacionDeValoresDummie() {
        Autor autor = Autor.findByName("Ñ");
        autor.delete();

        IngredienteR ingrediente= IngredienteR.findByName("Ñ");
        ingrediente.delete();
        IngredienteR ingrediente2= IngredienteR.findByName("Ñ");
        ingrediente2.delete();

        Receta receta = Receta.findByName("Ñ");
        receta.delete();

    }


}
