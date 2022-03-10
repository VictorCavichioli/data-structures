package estruturaDados.tarefas.dataStucturesWithList;

public class fila {

    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int total;

    public fila(){
        valores = new int[10];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void insert(int e){
        if (isFull()){
            throw new RuntimeException("Fila cheia!");
        }
        valores[ultimo] = e;
        ultimo = (ultimo +1) % valores.length;
        total ++;

    }

    public int retirar(){
        if(isEmpty()){
            throw new RuntimeException("Fila vazia!");
        }
        int e = valores[primeiro];
        primeiro = (primeiro + 1) % valores.length;
        total --;
        return e;

    }

    public boolean isEmpty(){
        return total ==0;
    }

    public boolean isFull(){
        return total ==valores.length;
    }

    public static void main(String[] args) {
        fila f = new fila();
        f.insert(1);
        f.insert(2);
        f.insert(3);

        while (!f.isEmpty()){
            int x = f.retirar();
            System.out.println("Retirei o elemento " + x);
        }
    }

}
