import static org.junit.jupiter.api.Assertions.*;
import java.beans.Transient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion4Test {

    static Funcion4 funcion4 = null;
    static int contpru = 0;
    

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion4 = new Funcion4();
    }

    @BeforeEach
    private void cont() {
        contpru++;
        System.out.println("Empezamos la prueba "+contpru);
    }

    @AfterEach
    private void noveces() {
        System.out.println("Se han realizado "+ contpru +" pruebas");
    }
   
    @AfterAll
    static void acabar() {
        contpru = 0;
        funcion4 = null;
        System.out.println("Todas las pruebas realizadas");
    }
    //Jose Antonio Reina
    @DisplayName("Test de Caja Negra Cadenas")
    @Test
    void test1() {
        assertEquals("oenin","eunio","abosero", funcion4.Funcion4("JoseAntonioReina", "JesusCansino", "PabloJoseCerero"));
  }
  //Jesus Cansino Molina
  @DisplayName("Test de Caja Negra con valores aleatorios")
   @Test
    void test2() {
    	assertEquals(true, funcion.funcion1((int)(Math.random() * 20)));
    }
  }
