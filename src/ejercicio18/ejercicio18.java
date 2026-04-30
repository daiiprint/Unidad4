package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	
	public static final String CELESTE = "\u001B[36m";
	public static final String RESET = "\u001B[0m";
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int tempCarg = 0;

		System.out.println("Cuantas temperaturas desea cargar?⛅: ");

		tempCarg = entrada.nextInt();

		double[] temps = cargarTemperaturas(tempCarg);

		filtrarCalurosas(temps);
		mostrarDatos(temps);

	}

	private static void mostrarDatos(double[] temps) {

		System.out.println("Las temperaturas cargadas son: ");

		for (int i = 0; i < temps.length; i++) {

			System.out.println("Temperatura " + (i + 1) + " : " + temps[i]);

		}
	}

	private static void filtrarCalurosas(double[] temps) {

		boolean hayCalurosas = false;

		System.out.println("La(s) temperatura(s) que supera(n) los 30° son: ");

		for (int i = 0; i < temps.length; i++) {

			if (temps[i] > 30) {

				System.out.println(temps[i]);

				hayCalurosas = true;

			}

			if (!hayCalurosas) {
				
				System.out.println("Ninguna.");
			}

		}

	}

	private static double[] cargarTemperaturas(int cantidad) {

		double[] temperaturas = new double[cantidad];

		for (int i = 0; i < temperaturas.length; i++) {

			do {

				System.out.println("Ingrese la temperatura " + (i + 1) + ": ");
				temperaturas[i] = entrada.nextDouble();

				if (temperaturas[i] >= 100) {

					System.err.println("Te estarias derritiendo🔥🥵!!");

				}
				if (temperaturas[i] <= -20) {

				  System.out.println(CELESTE + "Te estarias congelando❄️🥶!!" + RESET );

				}

			} while (temperaturas[i] >= 100 || temperaturas[i] <= -20);
		}
		return temperaturas;
	}

}
