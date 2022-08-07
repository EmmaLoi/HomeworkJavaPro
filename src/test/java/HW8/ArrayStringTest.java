package HW8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayStringTest {

    @Test
    void addValue() {
        ArrayString sut = new ArrayString();
        sut.add("element");
        Assertions.assertEquals(1, sut.size());
    }

    @Test
    void addValueByIndex() {
        ArrayString sut = new ArrayString();
        sut.add("Shifted");
        sut.add(0, "addedValueByIndex");
        Assertions.assertEquals("addedValueByIndex", sut.get(0));
        Assertions.assertEquals(2, sut.size());
    }

    @Test
    void delete() {
        ArrayString sut = new ArrayString();
        sut.add("1");
        sut.add("2");
        sut.add("3");
        sut.delete("2");
        Assertions.assertEquals(2, sut.size());
        Assertions.assertFalse(sut.contain("2"));
    }

    @Test
    void get() {
        ArrayString sut = new ArrayString();
        sut.add("Value by index 0");
        sut.add("Value by index 1");
        sut.add("Value by index 2");
        Assertions.assertEquals("Value by index 1", sut.get(1));
    }

    @Test
    void contain() {
        ArrayString sut = new ArrayString();
        sut.add("Dog");
        sut.add("Cat");
        sut.add("Fish");
        Assertions.assertTrue(sut.contain("Cat"));
    }

    @Test
    void clear() {
        ArrayString sut = new ArrayString();
        sut.add("Value - 1");
        sut.add("Value - 2");
        sut.add("Value - 3");
        sut.clear();
        Assertions.assertEquals(0, sut.size());
    }

    @Test
    void size() {
        ArrayString sut = new ArrayString();
        sut.add("1");
        sut.add("2");
        sut.add("3");
        Assertions.assertEquals(3, sut.size());
    }

    @Test
    void equals() {
        ArrayString sut1 = new ArrayString();
        ArrayString sut2 = new ArrayString();
        sut1.add("one");
        sut1.add("two");
        sut1.add("three");
        sut2.add("one");
        sut2.add("two");
        sut2.add("three");
        Assertions.assertTrue(sut1.equals(sut2));
    }
}