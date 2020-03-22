import java.util.Arrays;

public class Funciones {
	
	public class Funcion1 {
		public static Boolean Funcion1(int no) {
			int x = 23;
			
			Boolean resp = null;
			
			if(no%x==0) {
				
				resp = true;
				
			}else {
				
				resp = false;
			}
			return resp;	
			
		}
	}
	
	public class Funcion2{
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


	
	public class funcion3{
		public static int funcion3(int numero) {
				
			int x = 23;
			int y = 600;
			int y1 = 700;
			int r = (int) Math.floor(Math.random()*(y1+y));
		    int result = 0;
		    
			if (numero%x == 0) {
				result = numero%r;
			}
			return result;
		 }
	}
	
	public class Funcion4{
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
	
	public class Funcion5{
		public static int Funcion5(int [] no) {
			
			int tamano = no.length;
			int suma = 0; 
			int [] noarray = new int [tamano];
			
			for (int con = 0; con < tamano; con++) {
				noarray[con] = no[con];
				suma = suma + noarray[con];
			}
			return suma;
		}
	}

	public class Funcion6 {
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
	public class Funcion7 {
		public static String[] Funcion7(String [] cadenaDeNombres) {
			for (int i= 0; i < cadenaDeNombres.length;i++) {
				cadenaDeNombres[i] = cadenaDeNombres[i].substring(8,12);
			}
			System.out.println(Arrays.toString(cadenaDeNombres));
			return cadenaDeNombres;

		}
	}
	
	public class Funcion8 {
		public static Boolean funcion8(String[] alumnos, int[] tiemposDeTrabajos) {
				int t=900;
				 int sumar= 0;
				 Boolean result = true;
				 
				 
				for (int i = 0; i <tiemposDeTrabajos.length; i++) {
					sumar+=tiemposDeTrabajos[i];
				}
				if(sumar<=t) {
					result= false;
				}
				System.out.println("Los alumnos que han realizado este trabajo han sido:");
				System.out.println(Arrays.toString(alumnos));
				System.out.println("El tiempo de trabajo ha sido:");
				System.out.println(Arrays.toString(tiemposDeTrabajos));
				System.out.println("El tiempo total ha sido:"  +sumar);
				System.out.println("Por lo tanto la prueba ha salido:");
			   return result;
		}

	}
}

