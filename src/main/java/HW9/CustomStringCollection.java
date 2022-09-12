package HW9;

public interface CustomStringCollection {
    void add(String str);
    void addAll(StringCollection strColl);
    String get(int index);
    boolean contains(String str);
    boolean clear();
    int size();
}