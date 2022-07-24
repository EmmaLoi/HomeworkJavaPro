package HW13;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        StreamService streamService = new StreamService();

        Collection<Integer> number = Arrays.asList(11, 15, 19, 100);
        Collection<String> words = Arrays.asList("one", "two", "three", "four");

        System.out.println(streamService.averageOfAllNumbers(number));
        System.out.println(streamService.toUpperCase(words));
        System.out.println(streamService.findByLengthAndCase(words));

    }
}
