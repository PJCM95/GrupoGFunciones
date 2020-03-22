import java.util.Arrays;
public class Funcion7 {
	public static void main(String[] ags) {
		String [] array = {" ultraizquierdas", "ilegalizaciones", " narcotraficante", " ultraderechista"};
		System.out.println(Funcion7(array));
	}
		public static String[] Funcion7(String [] cadenaDeNombres) {
			
			for (int i= 0; i < cadenaDeNombres.length;i++) {
				cadenaDeNombres[i] = cadenaDeNombres[i].substring(8,12);
			}
			System.out.println(Arrays.toString(cadenaDeNombres));
			return cadenaDeNombres;

		}
	}


