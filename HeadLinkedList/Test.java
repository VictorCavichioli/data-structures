package HeadLinkedList;

public class Test {

    public static void main(String[] args) {

        List list = new List();
        list.insert(87);
        list.insert(34);
        list.insert(67);
        list.insert(21);
        list.insert(99);

        System.out.println("Testanto exibição em ordem normal");
        list.displayInOrder();

        System.out.println("===============================================");

        System.out.println("Testanto exibição em ordem reversa");
        list.displayInReverseOrder();

    }
}
