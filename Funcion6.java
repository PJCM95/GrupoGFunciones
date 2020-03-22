import java.util.Arrays;
public class Funcion6 {
public static void main(String[] args) {
	double [] array = {33, 69, 1};
	System.out.println(Funcion6(array));
}

		public static String Funcion6(double [] num1) {

	       
	        double z = 8;
	        double w = 8;
	        double[] numero2 = num1;
	        
			for (int cont = 0; cont < num1.length; cont++) {
	            if (num1[cont]%2==0) {
	                numero2[cont] = num1[cont]*z; 
	                System.out.print("  Numero Par -->  " + numero2[cont]);
	            }else {
	                numero2[cont] = num1[cont]*w; 
	                System.out.print("  Numero Impar -->  " + numero2[cont]);
	            }
	        }

	        System.out.println(" || El resultado en general es....");
	        return Arrays.toString(numero2);
			


	        }
}

