import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class Tests {

    @Test
    public void testIfCompanyNamesAreEqual() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

// When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfNumbersAreEqual() {
        int myNumber = 4;
        int userInput = 4;

        assertEquals(myNumber, userInput);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        Object phone = new Object();
        Object laptop = null;
        assertNull(laptop);
        assertNull(null);
        assertNotNull(phone);
    }

    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }

    @Test
    public void testIfSameString(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(actual, expected);
    }

    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();
    @Test
    public void testIfSameList() {
        assertNotSame("same languages", languages, moreLanguages);
    }
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
    @Before
    public void arrSetUp() {
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

    }

    @Test
    public void testIfSameArray() {
        assertArrayEquals(numbers, otherNumbers);
    }

    String language = "PHP";
    @Test
    public void testIfStringContains() {
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }


}
