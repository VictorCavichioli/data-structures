public class List {

    private Node start;

    // criando lista vazia
    public List(){
        this.start = null;
    }

    public void insert(Integer element){
        //Criando novo nó
        Node node = new Node();
        node.setElement(element); // Insere elemento no nó
        node.setNext(null); // Aponta ele para null

        if(start == null){
            start = node;
        }else {
            Node aux;
            aux = start;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(node);
        }

    }

    public Integer remove(){
        Node aux = start;
        Integer element = aux.getElement();
        start = aux.getNext();
        return element;
    }

    public void findAll(){
        if(start == null){
            System.out.printf("Lista vazia");
        }else {
            Node aux = start;
            while (aux!=null){
                System.out.printf("Elemento visto "+ aux.getElement());
                aux = aux.getNext();
            }
        }

    }

    public boolean isEmpty(){
        return this.start == null;
    }
}
