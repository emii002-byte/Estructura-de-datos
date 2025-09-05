package ajedrez;

public class Main {
    public static void main(String[] args) {
        // Crear un tablero de 8x8
        Array2D<String> tablero = new Array2D<>(8, 8);

        // Limpiar el tablero con casillas vacías
        tablero.limpiar(" ");

        // Piezas blancas (U+2654 a U+2659)
        String torreB = "\u2656";
        String caballoB = "\u2658";
        String alfilB = "\u2657";
        String reinaB = "\u2655";
        String reyB = "\u2654";
        String peonB = "\u2659";

        // Piezas negras (U+265A a U+265F)
        String torreN = "\u265C";
        String caballoN = "\u265E";
        String alfilN = "\u265D";
        String reinaN = "\u265B";
        String reyN = "\u265A";
        String peonN = "\u265F";

        // Fila 0: negras mayores
        tablero.setElemento(0, 0, torreN);
        tablero.setElemento(0, 1, caballoN);
        tablero.setElemento(0, 2, alfilN);
        tablero.setElemento(0, 3, reinaN);
        tablero.setElemento(0, 4, reyN);
        tablero.setElemento(0, 5, alfilN);
        tablero.setElemento(0, 6, caballoN);
        tablero.setElemento(0, 7, torreN);

        // Fila 1: peones negros
        for (int c = 0; c < 8; c++) {
            tablero.setElemento(1, c, peonN);
        }

        // Fila 6: peones blancos
        for (int c = 0; c < 8; c++) {
            tablero.setElemento(6, c, peonB);
        }

        // Fila 7: blancas mayores
        tablero.setElemento(7, 0, torreB);
        tablero.setElemento(7, 1, caballoB);
        tablero.setElemento(7, 2, alfilB);
        tablero.setElemento(7, 3, reinaB);
        tablero.setElemento(7, 4, reyB);
        tablero.setElemento(7, 5, alfilB);
        tablero.setElemento(7, 6, caballoB);
        tablero.setElemento(7, 7, torreB);

        // Imprimir el tablero
        System.out.println(tablero);
    }
}
