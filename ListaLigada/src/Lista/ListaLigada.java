package Lista;

import java.util.Objects;

public class ListaLigada<T> {
    Nodo<T> head;
    int tamanio = 0;
    Nodo<T> currNode;

    public ListaLigada() {
    }

    public boolean estaVacia() {
        return head == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    // agregar al final
    public void agregar_al_final(T valor) {
        if (head == null) {
            head = new Nodo<>(valor);
        } else {
            currNode = head;
            while (currNode.getSiguiente() != null) {
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodo<>(valor));
        }
        tamanio++;
    }

    // agregar al inicio
    public void agregar_al_inicio(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSiguiente(head);
        head = nuevo;
        tamanio++;
    }

    // agregar después de una referencia
    public boolean agregar_despues_de(T referencia, T valor) {
        currNode = head;
        while (currNode != null) {
            if (Objects.equals(currNode.getData(), referencia)) {
                Nodo<T> nuevo = new Nodo<>(valor);
                nuevo.setSiguiente(currNode.getSiguiente());
                currNode.setSiguiente(nuevo);
                tamanio++;
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }

    // eliminar por posición
    public boolean eliminar(int posicion) {
        if (posicion < 0 || posicion >= tamanio) return false;
        if (posicion == 0) {
            eliminar_el_primero();
            return true;
        }
        currNode = head;
        for (int i = 0; i < posicion - 1; i++) {
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(currNode.getSiguiente().getSiguiente());
        tamanio--;
        return true;
    }

    // eliminar el primero
    public void eliminar_el_primero() {
        if (head != null) {
            head = head.getSiguiente();
            tamanio--;
        }
    }

    // eliminar el último
    public void eliminar_el_final() {
        if (head == null) return;
        if (head.getSiguiente() == null) {
            head = null;
            tamanio--;
            return;
        }
        currNode = head;
        while (currNode.getSiguiente().getSiguiente() != null) {
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(null);
        tamanio--;
    }

    public int buscar(T valor) {
        currNode = this.head;
        int contador = 0;
        while (currNode != null) {
            if (Objects.equals(currNode.getData(), valor)) {
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T actual, T nuevo) {
        currNode = this.head;
        while (currNode != null) {
            if (Objects.equals(currNode.getData(), actual)) {
                currNode.setData(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }

    public void trasversal() {
        currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println("null");
    }
}