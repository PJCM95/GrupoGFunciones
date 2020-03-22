import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion3Test {

    static Funcion3 funcion3 = null;
    static int contpru = 0;

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion3 = new Funcion3();
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
        funcion3 = null;
        System.out.println("Todas las pruebas realizadas");
    }
    
    //José Antonio Reina Montes
    @DisplayName("Test de Caja Negra Con Valor")
    @Test
    void test1() {
        assertEquals(0, funcion3.Funcion3(56, 13));
    }
    //Jesus Cansino Molina
    @DisplayName("Test de Caja Negra con valores aleatorios")
    
    @Test
    void test3() {
        assertEquals(true, funcion.funcion1((int)(Math.random() * 20)));
    }

    // Pablo Jose Cerero

      @DisplayName("Test de Caja Negra sin valor")
    @Test
    void testFuncion3_3() {
        assertEquals(0, funcion.funcion3());
    }
}