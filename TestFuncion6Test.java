import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion5Test {

    static Funcion5 funcion6 = null;
    static int contpru = 0;

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion6 = new Funcion6();
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
        funcion6 = null;
        System.out.println("Todas las pruebas realizadas");
    }
    //José Antonio Reina Montes
    @DisplayName("Test de analisis de limites")
    @Test
    void test1() {
        assertNull(0, 0, 0, 0, funcion6.Funcion6(null));
    } 
//Jesus Cansino Molina
@DisplayName("Test de Caja Negra con cadena")
    @Test
    void testFuncion6() {
        assertArrayEquals({6, 72, 12, 1}, funcion.funcion6({1, 2, 2, 1}));
    }
}