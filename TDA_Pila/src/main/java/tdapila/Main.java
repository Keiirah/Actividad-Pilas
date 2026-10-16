package tdapila;

public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();

        System.out.println("La pila está vacía? " + pila.empty());

        pila.push("Manzana");
        pila.push("Pera");
        pila.push("Uva");
        pila.push("Naranja");
        pila.push("Platano");

        System.out.println("Elementos agregados: Manzana, Pera, Uva, Naranja, Platano");
        System.out.println("Cantidad de elementos: " + pila.size());

        
        System.out.println("Elemento del tope (peek): " + pila.peek());
        System.out.println("Cantidad después de peek: " + pila.size());

       
        System.out.println("Elemento extraído (pop): " + pila.pop());
        System.out.println("Nuevo tope: " + pila.peek());
        System.out.println("Cantidad después de pop: " + pila.size());

        System.out.println("Elemento extraído (pop): " + pila.pop());
        System.out.println("Elemento extraído (pop): " + pila.pop());

        System.out.println("La pila está vacía al final? " + pila.empty());

        
        try {
            pila.pop();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}
