package HW9;

public class Node {
    Node prev;
    String item;
    Node next;

    public Node(String value) {
        this.prev = null;
        this.item = value;
        this.next = null;
    }
}