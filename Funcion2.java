
public class Funcion2 {

public static void main(String[] args) {
	Boolean prueb = null;
	int numero = 700;
	int numeroPrueba = 0;
	int numero2 = 600;
	
	System.out.println("Comprobando si el numero existe entre los intervalos.....");
	
	if(numeroPrueba <= numero && numeroPrueba >= numero2) {
		prueb = true;
		System.out.println("El numero ha entrado dentro del intervalo");
	}
	else {
		prueb = false;
		System.out.println("El numero no ha entrado en el intervalo");
	}
		
	}
}
