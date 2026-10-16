package tdapila;

import java.util.NoSuchElementException;

/**
 * TDA Pila implementado con nodos enlazados.
 * La pila sigue el principio LIFO: el último elemento en entrar
 * es el primero en salir.
 */
public class Pila<T> {
    private Nodo<T> tope;
    private int nElementos;

    /**
     * Constructor: crea una pila vacía.
     */
    public Pila() {
        tope = null;
        nElementos = 0;
    }

    /**
     * Agrega un elemento en el tope de la pila.
     * @param elemento dato que se agregará
     */
    public void push(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.siguiente = tope;
        tope = nuevo;
        nElementos++;
    }

    /**
     * Extrae y devuelve el elemento que está en el tope.
     * @return elemento extraído
     * @throws NoSuchElementException si la pila está vacía
     */
    public T pop() {
        if (empty()) {
            throw new NoSuchElementException("No se puede hacer pop: la pila está vacía.");
        }

        T datoExtraido = tope.dato;
        tope = tope.siguiente;
        nElementos--;
        return datoExtraido;
    }

    /**
     * Consulta el elemento del tope sin extraerlo.
     * @return elemento que está en el tope
     * @throws NoSuchElementException si la pila está vacía
     */
    public T peek() {
        if (empty()) {
            throw new NoSuchElementException("No se puede hacer peek: la pila está vacía.");
        }

        return tope.dato;
    }

    /**
     * Indica si la pila está vacía.
     * @return true si está vacía; false si contiene elementos
     */
    public boolean empty() {
        return tope == null;
    }

    /**
     * Devuelve la cantidad de elementos. Método auxiliar para los ejemplos.
     */
    public int size() {
        return nElementos;
    }
}
