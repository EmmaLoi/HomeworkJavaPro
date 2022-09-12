package HW9;

public class StringCollection implements CustomStringCollection {
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(String value) {
        if (size != 0) {
            Node firstElement = new Node(value);
            tail.next = firstElement;
            firstElement.prev = tail;
            tail = firstElement;
        } else {
            tail = new Node(value);
            head = tail;
        }
        size++;
    }

    @Override
    public void addAll(StringCollection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }
    }

    @Override
    public String get(int index) {
        Node recurring = head;
        for (int i = 0; i < index; i++) {
            recurring = recurring.next;
        }
        return recurring.item;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = null;
        tail = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}