package ejercicio22;

import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio22 {

	static Scanner entrada = new Scanner(System.in);

	static ArrayList<Integer> StockPer = new ArrayList<>();

	static ArrayList<String> nombresPerfumes = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException{

		menu();

	}

	public static void menu() throws InterruptedException {

	    boolean repetir = true;

	    do {

	        Thread.sleep(2000);

	        System.out.println("\n------MENU------");

	        System.out.println("1- Agregar perfumes\r\n");
	        System.out.println("2- Mostrar inventario completo\r\n");
	        System.out.println("3- Consultar stock total\r\n");
	        System.out.println("4- Corregir stock de un perfume\r\n");
	        System.out.println("5- Eliminar perfumes\r\n");
	        System.out.println("6- Salir🚪🏃");

	        int opciones = entrada.nextInt();

	        switch (opciones) {

	        case 1:
	            agregarPerfume();
	            break;

	        case 2:
	            mostrarInventario();
	            break;

	        case 3:
	            calcularStockTotal();
	            break;

	        case 4:
	            modificarStock();
	            break;

	        case 5:
	            eliminarPerfume();
	            break;

	        case 6:
	            repetir = false;
	            break;

	        default:
	            System.err.println("Opción no registrada🤬💢");
	            break;
	        }

	    } while (repetir);
	}

	public static void eliminarPerfume() {

	    System.out.println("¿Qué perfume desea eliminar?");
	    String perEliminado = entrada.next();

	    boolean encontrado = false;

	    for (int i = 0; i < nombresPerfumes.size(); i++) {

	        if (perEliminado.equalsIgnoreCase(nombresPerfumes.get(i))) {

	            nombresPerfumes.remove(i);
	            StockPer.remove(i);

	            System.out.println("Perfume eliminado correctamente");
	            encontrado = true;
	            break;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Perfume no encontrado");
	    }
	}

	public static void modificarStock() {

			System.out.println("Ingrese el nombre del producto registrado:");
			String nombreDelProducto = entrada.next();
			for (int i = 0; i < nombresPerfumes.size(); i++) {

				if (nombreDelProducto.equals(nombresPerfumes.get(i))) {
 
					System.out.println("Modifique el Stock :");
					int modificar = entrada.nextInt();

					StockPer.set(i, modificar);
 
					System.out.println("Stock actualizado correctamente!!");
					break;
				}
			}
	}

	public static void calcularStockTotal() {

		int stockTotal = 0;

		for (int i = 0; i < StockPer.size(); i++) {
			stockTotal = stockTotal + StockPer.get(i);
		}

		System.out.println("El stock total es: " + stockTotal);

	}

	public static void mostrarInventario() {

		for (int i = 0; i < nombresPerfumes.size(); i++) {

			System.out.println("Perfume: "+ StockPer.get(i) +"x "+ nombresPerfumes.get(i));
		}

	}

	public static void agregarPerfume() {
		System.out.println("Ingrese el nombre del perfume");
		nombresPerfumes.add(entrada.next());

		System.out.println("Ingrese cantidad de perfumes");
		StockPer.add(entrada.nextInt());
	}

}
