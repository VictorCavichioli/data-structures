package estruturaDados.tarefas;

public class pilhaNode {

    Node start;
    Node end;
    int size;

    public void addInicio(String str) {
        Node node = new Node();
        node.str = str;
        node.last = null;
        node.next = start;
        if(start != null) {
            start.last = node;
        }
        start = node;
        if(size == 0) {
            end = start;
        }

        size++;
    }

    public String removeInicio() {
        if (start == null) {
            return null;
        }

        String out = start.str;
        start = start.next;
        if (start != null) {
            start.last = null;
        }

        size--;
        return out;
    }


}


