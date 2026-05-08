package ejercicio21;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio21 {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<String> nomIngr = new ArrayList<>();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese los nombres que deseé");
		String nombres = entrada.nextLine();
		
		while (!nombres.equals("fin")) {
			
			if(nombres.isBlank()) {
				
				System.err.println("Ingrese un nombre por favor!!😡🤬💢");
				
				 nombres = entrada.nextLine();
				
			}
			else {
				
				nomIngr.add(nombres);
			
			System.out.println("");
			
			nombres = entrada.nextLine();
			
			}
			
		}
		for (int i = 0; i < nomIngr.size(); i++) {
			System.out.println((i + 1) + "- " + nomIngr.get(i));
		}

		//sortearGanador();
		
	}

	public static void sortearGanador(ArrayList <String> nomIngr) {
	
		
		
	}

}
