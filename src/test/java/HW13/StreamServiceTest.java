package HW13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class StreamServiceTest {

    @Test
    void averageOfAllNumbers() {
        Collection<Integer> number = Arrays.asList(20,30,10);
        StreamService sut = new StreamService();
        Assertions.assertEquals(OptionalDouble.of(20.0), sut.averageOfAllNumbers(number));
    }

    @Test
    void toUpperCase() {
        Collection<String> words = List.of("one");
        StreamService sut = new StreamService();
       Assertions.assertEquals("[{one : ONE}]", sut.toUpperCase(words).toString());
    }

    @Test
    void findByLengthAndCase() {
        Collection<String> words = List.of("one", "1234", "abcd", "ABcd");
        StreamService sut = new StreamService();
        Assertions.assertEquals("[1234, abcd]", sut.findByLengthAndCase(words).toString());
    }
}
