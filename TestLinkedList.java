
public class TestLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<String> names = new SinglyLinkedList<>();
        names.addFirst("Jonathan");
        names.addLast("Nagamalla");
        System.out.println(names.first());
        System.out.println(names.last());
    }
}
