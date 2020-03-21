package GrupoG;

public class Funcion5{
	public static void main(String[] args) {
		int [] array = {22, 45, 25};
		System.out.println(Funcion5(array));
		
	}
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
