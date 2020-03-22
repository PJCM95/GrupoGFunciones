import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion7Test {

    static Funcion7 funcion7 = null;
    static int contpru = 0;

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion7 = new Funcion7();
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
        funcion7 = null;
        System.out.println("Todas las pruebas realizadas");
    }
    //José Antonio Reina 
     @DisplayName("Test de Caja Negra Valor Nulo")
     @Test
        void test1() {
            assertNull(" ", funcion7.Funcion7(null));
        }
    //Jesus Cansino Molina
@DisplayName("Test de Caja Negra con array")
    @Test
    void test2() {
        assertArrayEquals({"ehc" ,"eai", "lmr", "olla"},
                funcion.funcion7({"Leche", "Penalti", "Alfombra", "Botella"});
    }
}