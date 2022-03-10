package estruturaDados.tarefas.dataStucturesWithList;

public class pilha {

    int elementos[];
    int topo;

    public pilha(){
        elementos = new int[10];
        topo = -1; //posição inválida
    }

    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elementos[topo] = e;


    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty(){

        return (topo ==-1);

    }

    public boolean isFull(){
        return (topo == 9);
    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }

    public static void main(String[] args) {
        pilha p = new pilha();
        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        while(!p.isEmpty()){
            int elemento = p.pop();
            System.out.println("Desempilhei " + elemento);

        }

    }
}
