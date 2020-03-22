import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion5Test {

    static Funcion5 funcion5 = null;
    static int contpru = 0;

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion5 = new Funcion5();
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
        funcion5 = null;
        System.out.println("Todas las pruebas realizadas");
    }
    //Jose Antonio Reina
    @DisplayName("Test de Caja Negra con cadena")
    @Test
    void test1() {
        assertEquals(195, funcion5.Funcion5(
                "JoséAntonioReina 22/10/2001, Pablo José Cerero 01/10/1995, Jesus Cansino 11/12/2000"));
    }
    //Jesus Cansino Molina
    @DisplayName("Test de caja Negra con Valor Nulo")
    @Test
    void test2() {
    assertNull(funcion.funcion5(null));
    }
}
