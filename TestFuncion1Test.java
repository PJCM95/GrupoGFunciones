package GrupoG;

import static org.junit.jupiter.api.Assertions.*;
import java.beans.Transient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion1Test {

	static int contpru = 0;
	static Funcion1 funcion1 = null;

	@BeforeAll
	static void preparacion() {
		System.out.println("Empezamos");
		funcion1 = new Funcion1();
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
		funcion1 = null;
		System.out.println("Todas las pruebas realizadas");
	}
	
	//José Antonio Reina Montes

	@Test
	@DisplayName("Test de Caja Negra Nuestro nº es divisible entre X")
	void Test1() {
		assertEquals(true, funcion1.Funcion1(33));

	}
}

