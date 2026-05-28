package ejercicio21;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio21 {

	public static void main(String[] args) {
		
		ArrayList<String> nomIngr = new ArrayList<>();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese los nombres que deseé: ");
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
		
		System.out.println("\n--- Lista de Participantes ---");
		for (int i = 0; i < nomIngr.size(); i++) {
			System.out.println((i + 1) + "- " + nomIngr.get(i));
		}

		if (!nomIngr.isEmpty()) {
			sortearGanador(nomIngr); 
		} else {
			System.out.println("No hay participantes para realizar el sorteo.");
		}
		
	}
   
	public static void sortearGanador(ArrayList <String> nomIngr) {
		
		int numeroSorteado = (int) (Math.random() * nomIngr.size()) + 1;
		System.out.println("\nEl número que salió en el sorteo es: " + numeroSorteado);
		
		for (int i = 0; i < nomIngr.size(); i++) {
			int numeroAsignado = i + 1;

			if (numeroAsignado == numeroSorteado) {
				String ganador = nomIngr.get(i);
				System.out.println("Ganador -> Nombre: " + ganador + " (Número: " + numeroAsignado + ")");
				break;
			}
		}
	}
}
