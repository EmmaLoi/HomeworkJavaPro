package HW13;

public class Pair {
    private final String initialWord;
    private final String toUpperCaseWord;

    public Pair(String initialWord, String toUpperCaseWord) {
        this.initialWord = initialWord;
        this.toUpperCaseWord = toUpperCaseWord;
    }

    @Override
    public String toString() {
        return "{" + initialWord + " : " + toUpperCaseWord + "}";
    }
}
