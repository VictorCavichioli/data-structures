package estruturaDados.tarefas;

public class filaNode {

    Node start;
    Node end;
    int size;

    public void addEnd(String str) {
        Node node = new Node();
        node.str = str;
        node.next = null;
        node.last = end;

        if (end != null) {
            end.next = node;
        }

        end = node;
        if (size == 0) {
            start = end;
        }

        size++;
    }

    public String removeStart() {
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
