package tdapila;

/**
 * Nodo de una pila enlazada.
 * Cada nodo guarda un dato y una referencia al nodo que está debajo.
 */
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
