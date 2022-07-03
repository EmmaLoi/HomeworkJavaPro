package HW8;

import java.util.Arrays;
import java.util.Objects;

public class ArrayString implements ArrayStringInterface {
    private String[] elements;
    private int elementsCount;

    public ArrayString() {
        this.elements = new String[10];
    }

    @Override
    public String toString() {
        return "ArrayString{" +
                "elements=" + Arrays.toString(elements) +
                ", elementsCount=" + elementsCount +
                '}';
    }

    @Override
    public boolean add(String value) {
        if (elementsCount == elements.length) {
            String[] newArray = new String[increaseLengthOfArray()];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        elements[elementsCount++] = value;
        return true;
    }

    @Override
    public boolean add(int index, String value) {
        if (negativeIndexCondition(index)) {
            return false;
        }
        if (index == elements.length) {
            String[] newArray = new String[increaseLengthOfArray()];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = value;

        elementsCount++;
        return true;
    }

    @Override
    public boolean delete(String value) {
        for (int e = 0; e < elements.length; e++) {
            if (Objects.equals(elements[e], value)) {
                for (int j = e; j < elements.length - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elementsCount--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (negativeIndexCondition(index)) {
            System.out.println("Index entered incorrect");
        }
        return elements[index];
    }

    @Override
    public boolean contain(String value) {
        for (int i = 0; i < elementsCount; i++) {
            if (Objects.equals(value, elements[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        elements = new String[10];
        this.elementsCount = 0;
        return true;
    }

    @Override
    public int size() {
        return elementsCount;
    }

    @Override
    public boolean equals(ArrayString str) {
        if (this == str) return true;
        if (str == null || getClass() != str.getClass()) return false;
        return elementsCount == str.elementsCount && Arrays.equals(elements, str.elements);
    }

    private int increaseLengthOfArray() {
        return this.elements.length * 3 / 2 + 1;
    }

    private boolean negativeIndexCondition(int index) {
        return index < 0 || index > this.elementsCount;
    }
}
