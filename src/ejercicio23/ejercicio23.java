package ejercicio23;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio23 {

    static Scanner entrada = new Scanner(System.in);
    static Stack<Character> laLetra = new Stack<>();

    public static void main(String[] args) {

        System.out.println("Ingrese una palabra: ");

        String palabra = entrada.next();

        cargarPalabra(palabra, laLetra);

        String invertida = invertirPalabra(laLetra);

        System.out.println("Palabra invertida: " + invertida);
    }

    public static void cargarPalabra(String palabra, Stack<Character> pila) {

        for (int i = 0; i < palabra.length(); i++) {

            pila.push(palabra.charAt(i));
        }
    }

    public static String invertirPalabra(Stack<Character> pila) {

        String resultado = "";

        while (!pila.isEmpty()) {

            resultado += pila.pop();
        }

        return resultado;
    }
}