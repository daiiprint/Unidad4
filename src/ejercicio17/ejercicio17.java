/*Pedile al usuario que ingrese 5 notas enteras. Guardálas en un array. Creá las siguientes
funciones:
• ingresoDatos()→ Permitir el ingreso de datos, y validar que se ingresen números
mayores a 0.
• calcularPromedio(int[] notas) → devuelve double.
• buscarMayor(int[] notas) → devuelve int.
• buscarMenor(int[] notas) → devuelve int.
• Otra función que muestre promedio, nota mayor y nota menor por
pantalla.*/
package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ingresoDatos();
		calcularPromedio();
		buscarMayor();
		buscarMenor();
        mostrarPromMayMen();
		
	}

	public static void mostrarPromMayMen() {
		
		
		
	}

	public static void buscarMenor() {
		
		
		
	}

	public static void buscarMayor() {
		
		
		
	}

	public static void calcularPromedio() {
		
		
		
	}

	public static int[] ingresoDatos() {

		
		int[] numsIng = 5;
		
		System.out.println("Ingrese 5 notas: ");
		
		
		
		for (int i = 0 ; i < 5 ; i++) {
			
			do {
			numsIng[i] = entrada.nextInt();
			
			if(numsIng[i]<0) {
				
				System.err.println("ERROR ingrese un numero entero!!😡");
				
			}
			}while(numsIng[i]<0) ;
				
			
		
		}	
		return numsIng;
	}

}
