package MetodosADT;
import java.util.ArrayList;
public class adt {



    public class SetADT<T> {
        public ArrayList<T> data;

        public SetADT() {
            data = new ArrayList<>();
        }

        public int longitud() {
            return data.size();
        }

        public void agregar(T elemento) {
            if (!this.contiene(elemento)) {
                data.add(elemento);
            }
        }

        public boolean contiene(T elemento) {
            return data.contains(elemento);
        }

        public void eliminar(T elemento) {
            data.remove(elemento);
        }

        public String toString() {
            String resultado = "{";
            for (int i = 0; i < data.size(); i++) {
                resultado += data.get(i);
                if (i < data.size() - 1) {
                    resultado += ", ";
                }
            }
            resultado += "}";
            return resultado;
        }

        // -------- Métodos que faltan --------

        // Equals: compara si dos conjuntos son iguales
        public boolean equals(SetADT<T> otroConjunto) {
            if (this.longitud() != otroConjunto.longitud()) {
                return false;
            }
            for (T elemento : data) {
                if (!otroConjunto.contiene(elemento)) {
                    return false;
                }
            }
            return true;
        }

        // Es sub conjunto
        public boolean esSubConjunto(SetADT<T> otroConjunto) {
            for (T elemento : data) {
                if (!otroConjunto.contiene(elemento)) {
                    return false;
                }
            }
            return true;
        }

        // Unión
        public SetADT<T> union(SetADT<T> otroConjunto) {
            SetADT<T> resultado = new SetADT<>();
            for (T elemento : data) {
                resultado.agregar(elemento);
            }
            for (T elemento : otroConjunto.data) {
                resultado.agregar(elemento);
            }
            return resultado;
        }

        // Intersección
        public SetADT<T> interseccion(SetADT<T> otroConjunto) {
            SetADT<T> resultado = new SetADT<>();
            for (T elemento : data) {
                if (otroConjunto.contiene(elemento)) {
                    resultado.agregar(elemento);
                }
            }
            return resultado;
        }

        // Diferencia (los elementos que están en este conjunto pero no en el otro)
        public SetADT<T> diferencia(SetADT<T> otroConjunto) {
            SetADT<T> resultado = new SetADT<>();
            for (T elemento : data) {
                if (!otroConjunto.contiene(elemento)) {
                    resultado.agregar(elemento);
                }
            }
            return resultado;
        }
    }
}
