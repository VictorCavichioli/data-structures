package estruturaDados.tarefas;

public class Main {
    public static void main(String args[]){

        pilhaNode node = new pilhaNode();

        node.addInicio("1");
        node.addInicio("2");
        node.addInicio("3");
        node.addInicio("4");
        node.addInicio("5");

        System.out.println("-=-=-=-=-=DEMONSTRAÇÃO DE PILHA=-=-=-=-=-");

        System.out.println("Removi: " + node.removeInicio());
        System.out.println("Removi: " + node.removeInicio());
        System.out.println("Removi: " + node.removeInicio());
        System.out.println("Removi: " + node.removeInicio());
        System.out.println("Removi: " + node.removeInicio());

        /**
        filaNode fnode = new filaNode();

        fnode.addEnd("1");
        fnode.addEnd("2");
        fnode.addEnd("3");
        fnode.addEnd("4");
        fnode.addEnd("5");

        System.out.println("-=-=-=-=-=DEMONSTRAÇÃO DE FILA=-=-=-=-=-");

        System.out.println("Removi: " + fnode.removeStart());
        System.out.println("Removi: " + fnode.removeStart());
        System.out.println("Removi: " + fnode.removeStart());
        System.out.println("Removi: " + fnode.removeStart());
        System.out.println("Removi: " + fnode.removeStart());
         */
    }
}
