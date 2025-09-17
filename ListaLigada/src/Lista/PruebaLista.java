package Lista;

public class PruebaLista {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();

        System.out.println("¿Lista vacía? " + lista.estaVacia());

        // Agregar elementos
        lista.agregar_al_final(10);
        lista.agregar_al_final(20);
        lista.agregar_al_final(30);
        lista.trasversal();

        // Agregar al inicio
        lista.agregar_al_inicio(5);
        lista.trasversal();

        // Agregar después de un nodo
        lista.agregar_despues_de(20, 25);
        lista.trasversal();

        // Buscar
        System.out.println("Posición de 25: " + lista.buscar(25));
        System.out.println("Posición de 100: " + lista.buscar(100));

        // Actualizar
        lista.actualizar(25, 26);
        lista.trasversal();

        // Eliminar primero
        lista.eliminar_el_primero();
        lista.trasversal();

        // Eliminar último
        lista.eliminar_el_final();
        lista.trasversal();

        // Eliminar por posición
        lista.eliminar(1);
        lista.trasversal();

        System.out.println("Tamaño final: " + lista.getTamanio());
    }
}