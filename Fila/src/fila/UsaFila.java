
package fila;

public class UsaFila {
    public static void main(String[] args) {
        Fila f = new Fila(4);
        f.enqueue(1);
        f.print();
        
        f.enqueue(2);
        f.print();
        
        f.enqueue(3);
        f.print();
        
        f.enqueue(4);
        f.print();
        
        f.enqueue(5);
        f.print();
        
        f.dequeue();
        f.print();
        f.dequeue();
        f.print();
        f.dequeue();
        f.print();
        f.dequeue();
        f.print();
        f.dequeue();
        f.print();
        
        
    }
}
