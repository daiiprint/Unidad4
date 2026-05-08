package ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {

		ArrayList<String> canciones = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escriba el  nombre de la cancion que deseé 🎧 ૮₍ ˃ ⤙ ˂ ₎ა");
		String nombre = entrada.nextLine();

		while (!nombre.equals("fin")) {

			canciones.add(nombre);

			System.out.println("Ingrese otra cancion. Escriba FIN para finalizar 🎶");

			nombre = entrada.nextLine();

		}

		for (int i = 0; i < canciones.size(); i++) {
			System.out.println((i + 1) + "- " + canciones.get(i));
		}

	}

}
