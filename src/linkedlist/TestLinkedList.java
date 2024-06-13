package linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("Elemento 1");

        System.out.println(linkedList.getHead());
        System.out.println(linkedList.getTail());
        System.out.println(linkedList.getSize());
        linkedList.print();

        linkedList.append("Elemento 2");
        linkedList.append("Elemento 3");

        linkedList.prepend("Elemento 0");
        linkedList.print();

        linkedList.insert(3, "Elemento 2.5");
        linkedList.print();

        linkedList.delete(3);
        linkedList.print();
    }
}
