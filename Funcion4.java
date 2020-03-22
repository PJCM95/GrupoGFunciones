package GrupoG;

public class Funcion4{
	public static void main(String[] args) {
		System.out.println(Funcion4("Pablo", "Jose", "Jesus"));
	}
public static String Funcion4(String CadNombre, String CadNombre1, String CadNombre3) {

		String CadConca = null;

		for (int i = 0; i < CadNombre.length(); i++) {

			CadConca = CadNombre+ " , " +CadNombre1+ " , " +CadNombre3;
		}

		CadConca = CadConca.replaceAll("[AaEeIiOoUu]", "");

		CadConca = CadConca.replaceAll("[A-Z]", "");

		System.out.println(CadConca);

		return CadConca;
	}
}