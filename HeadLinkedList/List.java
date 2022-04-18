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
        Node node = new Node();
        node.setElement(element);

        if(isEmpty()){
            node.setNext(node);
            node.setPrevious(node);
            start = node;
        }

    }

    public void displayInOrder(){

    }
}
