package fila;

public class Fila {
    public int head;
    public int tail;
    public int MAX;
    public int[] FILA;
    
    public Fila(int tamanho){
        head = 0;
        tail = 0;
        MAX = tamanho;
        FILA = new int[MAX];
    }
    
    public boolean isFull(){
        return tail == MAX;
    }
    
    public void enqueue(int x){
        if(!isFull()){
            FILA[tail++] = x;
        }else{
            System.out.print("A fila está cheia");
        }
        }
    public boolean isEmpty(){
        return tail == MAX;
    }
    
    public int dequeue(){
        if(!isEmpty()){
            return FILA[head++];
        }else{
            System.out.print("A fila está vazia");
        return -1;
        }
    }
    
    public void print(){
         for(int i = head; i<tail; i++){
             System.out.println(""+FILA[i]);
         }
    }
    }

