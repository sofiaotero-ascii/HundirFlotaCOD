/**
 * @version 2.0
 * @autor Sofía Otero
 * Crear un tablero de hundir la flota con array para luego recorrerlo con un
 * bucle for para imprimir por pantalla donde hay barcos.
 */

public class HundirFlota { // Definimos la clase principal del programa llamada "HundirFlota"
    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa

        // Creamos el tablero con barcos (B), portaaviones (P), submarinos (S) y agua (a)
        char[][] tablero = {
                {'a', 'a', 'B', 'a', 'a'}, // Primera fila: agua y un barco
                {'a', 'B', 'a', 'a', 'a'}, // Segunda fila: agua y un barco
                {'a', 'S', 'a', 'B', 'a'}, // Tercera fila: un submarino y un barco
                {'P', 'P', 'P', 'P', 'a'}, // Cuarta fila: un portaaviones (4 celdas consecutivas)
                {'a', 'S', 'a', 'a', 'a'}  // Quinta fila: un submarino
        };

        // Imprimimos un mensaje indicando que vamos a mostrar los lugares donde hay barcos
        System.out.println("Hay barcos en:");

        // Llamamos al método que imprimirá las coordenadas de los barcos
        imprimirLugaresDeBarcos(tablero);
    }

    // Método para buscar e imprimir las posiciones de los barcos en el tablero
    public static void imprimirLugaresDeBarcos(char[][] tablero) {

        // Recorremos todas las filas del tablero
        for (int fila = 0; fila < tablero.length; fila++) {
            // Recorremos todas las columnas de la fila actual
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                // Verificamos si hay un barco ('B'), un portaaviones ('P') o un submarino ('S') en la celda actual
                if (tablero[fila][columna] == 'B') { // Si es un barco
                    System.out.println("Barco en (" + fila + "," + columna + ")");
                } else if (tablero[fila][columna] == 'P') { // Si es un portaaviones
                    System.out.println("Portaaviones en (" + fila + "," + columna + ")");
                } else if (tablero[fila][columna] == 'S') { // Si es un submarino
                    System.out.println("Submarino en (" + fila + "," + columna + ")");
                }
            }
        }
    }
}
