package GrupoG;

public class Funcion1 {
	public static void main(String[] args) {
		System.out.println(Funcion1(45));
	}
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
