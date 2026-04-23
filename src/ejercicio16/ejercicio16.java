package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	static Scanner entrada = new Scanner(System.in);

	static String jugadores;

	public static void main(String[] args) {

		mostrarArrays(cargarJugadores());

	}

	public static void mostrarArrays(String listaDeJugadores[]) {

		for (int i = 0; i < 7; i++) {

			System.out.println("Jugadores :" + listaDeJugadores[i]);

		}

	}

	public static String[] cargarJugadores() {

		String[] cargarJugadores = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta",
				"Eito" };

		return cargarJugadores;
	}

}
