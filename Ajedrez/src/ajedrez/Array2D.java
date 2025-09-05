package ajedrez;

public class Array2D<T> {
    private final Object[][] datos;

    // Constructor: ren = renglones, col = columnas
    public Array2D(int ren, int col) {
        if (ren <= 0 || col <= 0) {
            throw new IllegalArgumentException("Tamaños deben ser > 0");
        }
        this.datos = new Object[ren][col];
    }

    // limpiar(dato): establece todos los valores al dato
    public void limpiar(T dato) {
        for (int i = 0; i < getRowSize(); i++) {
            for (int j = 0; j < getColSize(); j++) {
                datos[i][j] = dato;
            }
        }
    }

    // getRowSize(): número de renglones
    public int getRowSize() {
        return datos.length;
    }

    // getColSize(): número de columnas
    public int getColSize() {
        return datos[0].length;
    }

    // setElemento(ren, col, dato)
    public void setElemento(int ren, int col, T dato) {
        validarIndices(ren, col);
        datos[ren][col] = dato;
    }

    // getElemento(ren, col)
    @SuppressWarnings("unchecked")
    public T getElemento(int ren, int col) {
        validarIndices(ren, col);
        return (T) datos[ren][col];
    }

    private void validarIndices(int ren, int col) {
        if (ren < 0 || ren >= getRowSize() || col < 0 || col >= getColSize()) {
            throw new IndexOutOfBoundsException(
                    "Índices fuera de rango: (" + ren + ", " + col + ")"
            );
        }
    }

    // toString(): estado del arreglo 2D
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getRowSize(); i++) {
            for (int j = 0; j < getColSize(); j++) {
                Object val = datos[i][j];
                sb.append(val == null ? " " : val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
