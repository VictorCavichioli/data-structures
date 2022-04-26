package HeadLinkedList;

public class List {

    private Node start;

    public List(){
        this.start = null;
    }

    public boolean isEmpty(){
        return (this.start == null);
    }

    public void insert(Integer element){
        Node newNode = new Node();
        newNode.setElement(element);

        if(isEmpty()){
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            start = newNode;
        }else {
            Node aux = start;
            while (aux.getNext() != start){
                aux = aux.getNext();
            }
            start.setPrevious(newNode);
            aux.setNext(newNode);
            newNode.setPrevious(aux);
            newNode.setNext(start);
        }

    }

    public void displayInOrder(){

        Node aux;
        aux = start; //inicio não quebrar o sistema, n perder a referencia do inicio
        do{
            System.out.println("Element: " + aux.getElement());
            aux = aux.getNext();
        } while (aux != start);

    }

    public void displayInReverseOrder(){

        Node aux;
        aux = start; //inicio não quebrar o sistema, n perder a referencia do inicio
        do{
            System.out.println("Element: " + aux.getElement());
            aux = aux.getPrevious();
        } while (aux != start);

    }

    public Integer removeOnStart(){
        Node aux;
        aux = start;
        Integer element = aux.getElement();
        start = aux.getNext();
        start.setPrevious(aux.getPrevious());
        start.getPrevious().setNext(start);
        return element;
    }

    public Integer removeOnLast(){

        Node aux;
        aux = start.getPrevious();
        Integer element = aux.getElement();
        aux.getPrevious().setNext(start);
        start.setPrevious(aux.getPrevious());

        return element;

    }
}
