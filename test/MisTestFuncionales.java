import controllers.AutorController;
import models.Autor;
import models.IngredienteR;
import models.Receta;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import play.mvc.Result;
import play.test.WithApplication;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static play.test.Helpers.contentAsString;

public class MisTestFuncionales extends WithApplication {

    @Before
    public void insercionDeValoresDummie() {
        Autor autor = new Autor();
        autor.setNombre("Dummie");
        autor.setEdad(31);
        autor.save();

        IngredienteR ingrediente = new IngredienteR();
        ingrediente.setNombre("Dummie");
        ingrediente.setCantidad("Dummie");
        ingrediente.save();
        IngredienteR ingrediente2 = new IngredienteR();
        ingrediente2.setNombre("Dummie2");
        ingrediente2.setCantidad("Dummie2");
        ingrediente2.save();

        List<IngredienteR> ingredientes = new ArrayList<IngredienteR>();

        Receta receta = new Receta();
        receta.setTitulo("Dummie");
        receta.setAutor(autor);
        receta.setIngredientes(ingredientes);
        receta.save();

    }

    @Test
    public void testListarAutoresContentNegotiationNotNull() {
        AutorController controladorAutor = new AutorController();
        Result res = controladorAutor.listarAutores();

        assertNotNull(res.contentType());
    }

    @Test
    public void compruebaQueElModeloAutorRetornaUnAutor() {
        Autor autor = Autor.findByName("Dummie");
        assertNotNull(autor);
    }

    @Test
    public void compruebaQueElModeloAutorRetornaUnicamenteSiElNombreEsExactoIncluyendoMayusculas() {
        Autor autor = Autor.findByName("DUMMIE");
        assertNull(autor);
    }

    @Test
    public void compruebaQueElModeloAutorRetornaNullCuandoBuscamosUnNombreQueNoExiste() {
        Autor autor = Autor.findByName("ASDDDWEASFFAEEFADXCZCSFEFFFARASDGG");
        assertNull(autor);
    }

    @Test
    public void compruebaQueElModeloIngredienteRetornaUnAutor() {
        IngredienteR ingrediente = IngredienteR.findByName("Dummie");
        assertNotNull(ingrediente);
    }

    @Test
    public void compruebaQueElModeloIngredienteRetornaUnicamenteSiElNombreEsExactoIncluyendoMayusculas() {
        IngredienteR ingrediente = IngredienteR.findByName("DUMMIE");
        assertNull(ingrediente);
    }

    @Test
    public void compruebaQueElModeloIngredienteRetornaNullCuandoBuscamosUnNombreQueNoExiste() {
        IngredienteR ingrediente = IngredienteR.findByName("ASDDDWEASFFAEEFADXCZCSFEFFFARASDGG");
        assertNull(ingrediente);
    }

    @Test
    public void compruebaQueElModeloRecetaRetornaUnaReceta() {
        Receta receta = Receta.findByName("Dummie");
        assertNotNull(receta);
    }

    @Test
    public void compruebaQueElModeloRecetaRetornaUnicamenteSiElNombreEsExactoIncluyendoMayusculas() {
        Receta receta = Receta.findByName("DUMMIE");
        assertNull(receta);
    }

    @Test
    public void compruebaQueElModeloRecetaRetornaNullCuandoBuscamosUnNombreQueNoExiste() {
        Receta receta = Receta.findByName("ASDDDWEASFFAEEFADXCZCSFEFFFARASDGG");
        assertNull(receta);
    }

    @Test
    public void compruebaQueElModeloIngredienteNoAdmiteSalvarSinAtributoCantidad() {
        IngredienteR ingrediente = IngredienteR.findByName("Dummie");
        ingrediente.setCantidad(null);
        ingrediente.save();
    }

    @Test
    public void compruebaQueElModeloRecetaNoAdmiteSalvarSinAutor() {
        Receta receta = Receta.findByName("Dummie");
        receta.setAutor(null);
        receta.save();
    }


    @After
    public void eliminacionDeValoresDummie() {
        Autor autor = Autor.findByName("Dummie");
        autor.delete();

        IngredienteR ingrediente= IngredienteR.findByName("Dummie");
        ingrediente.delete();
        IngredienteR ingrediente2= IngredienteR.findByName("Dummie2");
        ingrediente2.delete();

        Receta receta = Receta.findByName("Dummie");
        receta.delete();

    }

}
