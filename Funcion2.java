public class Funcion2{
	public static void main(String[] args) {
	System.out.println(Funcion2(640));	
	}
public static Boolean Funcion2(int numeroPrueba) {
		Boolean prueb = null;
		int numeroY = 700;
		int numeroY2 = 600;
	if(numeroPrueba <= numeroY && numeroPrueba >= numeroY2) {
		prueb = true;
	}else {
		prueb = false;
	}
	return prueb;
	}
}

 