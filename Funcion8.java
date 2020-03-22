 import java.util.Arrays;
public class Funcion8 {
 public static void main(String[] args) {
	 String [] array = {"Pablo", "Jose", "Jesus"};
	 int[] array1 = {860, 120, 240};
	 System.out.println(funcion8(array, array1));
}
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


