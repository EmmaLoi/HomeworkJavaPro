package HW8;

public interface ArrayStringInterface {
    boolean add(String value);
    boolean add(int index, String value);
    boolean delete(String value);
    String get(int index);
    boolean contain(String value);
    boolean equals(ArrayString str);
    boolean clear();
    int size();
}
