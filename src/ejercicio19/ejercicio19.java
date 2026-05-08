package ejercicio19;

public class ejercicio19 {

    public static void main(String[] args) {

        int[][] tablero = {
            {0, 0, 1},
            {0, 1, 0},
            {1, 0, 0}
        };

        mostrarTablero(tablero);

        int totalMinas = contarMinas(tablero);
        System.out.println("Cantidad de minas: " + totalMinas);
    }

    public static void mostrarTablero(int[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                // Posiciones que deben mostrar
            	
                if ((i == 0 && j == 2) || 
                    (i == 2 && j == 0) || 
                    (i == 1 && j == 2)) {

                    System.out.print("* ");

                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // salto de línea
        }
    }

    public static int contarMinas(int[][] tablero) {

        int contador = 0;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (tablero[i][j] == 1) {
                    contador++;
                }
            }
        }

        return contador;
    }
}