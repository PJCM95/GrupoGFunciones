import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion8Test {

    static Funcion8 funcion8 = null;
    static int contpru = 0;

    @BeforeAll
    static void preparacion() {
        System.out.println("Empezamos los Test");
        funcion8 = new Funcion8();
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
		funcion8 = null;
		System.out.println("Todas las pruebas realizadas");
	}
	
	//Jose Antonio Reina 
	 @DisplayName ("Prueba de caja negra correcta: ")
		@Test
		void test1(){
			ArrayList <String> alumnos = new arrayList <String> ();
			alumnos.add("Laura");
			alumnos.add("Luis");
			alumnos.add("Juan");
			int [][] time = {{700,700,700}, {300,300,300}, {500,500,500}};
			assertEquals(true, funcion8.Funcion8 (time, alumnos));

	}
}