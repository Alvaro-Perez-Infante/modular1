package pakage;

import java.util.Scanner;

public class Ejercicio {

	
	public static void main(String[]args) {
		
		int numVeces;
		
		numVeces = Util.leerInt("¿Cuántas veces hacemos eco?");
		
		eco(numVeces);
		
		
	}
		
		public static void eco(int n) {
			
			for (int i=1; i<= n; i++) {
				System.out.println("Eco...");
				
			}
			
		}
		
}	
