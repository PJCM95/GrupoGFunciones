package GrupoG;

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
}

   