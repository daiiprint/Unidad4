
package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[] notas = ingresoDatos();
		double prom = calcularPromedio(notas);
		int numMayor = buscarMayor(notas);
		int numMenor = buscarMenor(notas);

		mostrarPromMayMen(prom, numMayor, numMenor);
	}

	public static void mostrarPromMayMen(double promedio, int mayor, int menor) {

		System.out.println("El promedio de las notas ingresadas son: " + promedio);

		System.out.println("El numero mayor es : " + mayor);

		System.out.println("El numero menor es : " + menor);

	}

	public static int buscarMenor(int[] notasIng) {

		int numMenor = notasIng[0];

		for (int i = 0; i < notasIng.length; i++) {

			if (notasIng[i] < numMenor) {

				numMenor = notasIng[i];

			}
		}
		return numMenor;

	}

	public static int buscarMayor(int[] notasIng) {

		int numMayor = 0;

		for (int i = 0; i < 5; i++) {

			if (notasIng[i] > numMayor) {

				numMayor = notasIng[i];

			}

		}

		return numMayor;
	}

	public static double calcularPromedio(int[] notas) {

		double suma = 0;

		for (int i = 0; i < notas.length; i++) {

			suma += notas[i];

		}

		return suma / notas.length;
	}

	public static int[] ingresoDatos() {

		int[] numsIng = new int[5];

		System.out.println("Ingrese 5 notas: ");

		for (int i = 0; i < 5; i++) {

			do {

				System.out.print("Nota " + (i + 1) + ": ");

				numsIng[i] = entrada.nextInt();

				if (numsIng[i] <= 0) {

					System.err.println("ERROR ingrese un numero entero!!😡");

				}
			} while (numsIng[i] <= 0);

		}
		return numsIng;
	}

}
