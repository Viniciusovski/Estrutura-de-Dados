package fila.circular;

public class FilaCircular {
    final int TAMMAX;
    Object[] dados;
    int inicio = 0, fim = 0, tamanho = 0;

    public FilaCircular(int tamanho){
        dados = new Object[tamanho];
        TAMMAX = tamanho;
    }
    
    public void enqueue(Object x) {
        if (tamanho == TAMMAX) {
            System.out.println("A Fila está cheia!");
        } else {
            dados[fim] = x;
            fim = (fim + 1) % TAMMAX;
            tamanho++;
        }
    }

    public Object dequeue() {
        if (tamanho > 0) {
            Object tmp = dados[inicio];
            dados[inicio] = 0;
            inicio = (inicio + 1) % TAMMAX;
            tamanho--;
            return tmp;
        } else {
            System.out.println("A Fila está vazia");
        }
        return 0;
    }

    public void mostraFila() {
        for (int i = 0; i < TAMMAX; i++) {
            if (dados[i] != null) {
                System.out.print("[" +dados[i] + "]");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        FilaCircular fc = new FilaCircular(5);
            
        fc.enqueue(1);
        fc.mostraFila();
        fc.enqueue(2);
        fc.mostraFila();
        fc.enqueue(3);
        fc.mostraFila();
        fc.enqueue(4);
        fc.mostraFila();
        fc.enqueue(5);
        fc.mostraFila();
        fc.enqueue(6);
        
        fc.dequeue();
        fc.mostraFila();  
        fc.dequeue();
        fc.mostraFila();  
        
        fc.enqueue(6);
        fc.mostraFila();
        
        fc.dequeue();
        fc.mostraFila();
    }
}

