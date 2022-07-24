package HW13;

import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamService {
    public OptionalDouble averageOfAllNumbers(Collection<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public List<Pair> toUpperCase(Collection<String> words) {
        return words.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .collect(Collectors.toList());

    }

    public Collection<String> findByLengthAndCase(Collection<String> words){
        Predicate<String> isLowerCase = s -> s.equals(s.toLowerCase());
        Predicate<String> isLengthFour = s -> s.length() == 4;

        return words.stream()
                .filter(isLowerCase)
                .filter(isLengthFour)
                .collect(Collectors.toList());
    }
}
