package HW8;

public class Main {
    public static void main(String[] args) {
        ArrayString example = new ArrayString();
        example.add("11");
        example.add("Add");
        example.add("12");
        example.add("New");
        example.add("10");

        ArrayString example2 = new ArrayString();
        example2.add("11");
        example2.add("Add");
        example2.add("12");
        example2.add("New");
        example2.add("10");

        System.out.println(example);
        System.out.println(example.equals(example2));

        example.add(1,"shift");
        example.add(0,"10");
        System.out.println(example);
        example.delete("12");
        System.out.println(example);
        System.out.println("Value by index is: " + example.get(2));
        System.out.println(example.contain("Add"));
        System.out.println(example.size());
        System.out.println(example.clear());
        System.out.println(example);
    }
}
