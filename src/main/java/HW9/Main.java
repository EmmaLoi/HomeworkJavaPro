package HW9;

public class Main {

    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        StringCollection stringCollection2 = new StringCollection();

        stringCollection2.add("Value1");
        stringCollection2.add("Value2");

        stringCollection.add("Test1");
        stringCollection.add("Test2");
        stringCollection.add("Test3");

        System.out.println("Collection size: " + stringCollection.size());
        stringCollection.addAll(stringCollection2);
        System.out.println("Collection size after adding new collection: " + stringCollection.size());

        System.out.println(stringCollection.get(1));
        System.out.println(stringCollection.contains("Test0"));
        System.out.println(stringCollection.contains("Value2"));
        System.out.println(stringCollection.clear());
        System.out.println(stringCollection.size());
    }
}