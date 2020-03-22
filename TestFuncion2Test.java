import static org.junit.jupiter.api.Assertions.*;
    import org.junit.jupiter.api.AfterAll;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeAll;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Test;

    public class TestFuncion2Test {

        static Funcion2 funcion2 = null;
        static int contpru = 0;

        @BeforeAll
        static void preparacion() {
            System.out.println("Empezamos los Test");
            funcion2 = new Funcion2();
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
            funcion2 = null;
            System.out.println("Todas las pruebas realizadas");
        }
       

            //José Antonio Reina Montes
        @DisplayName("Test de Caja Negra Con Un Valor Nulo")
        @Test
        void test1() {
            assertNull(Funcion2.funcion2(null));
        }
       
        //Jesus Cansino Molina
       
        @DisplayName("Test de Caja Negra con un valor")
        @Test
        void test2() {
            assertEquals(true, Funcion2.funcion2(7));
        }

        //Pablo Cerero 

         @DisplayName("Test de Analisis de valores limites")
             @Test 
    void test3() {
        assertEquals(true, Funcion2.funcion2(500));
        assertEquals(false, Funcion2.funcion2(501));
        assertEquals(true, Funcion2.funcion2(400));
        assertEquals(false, Funcion2.funcion2(399));
    }   
     
    }