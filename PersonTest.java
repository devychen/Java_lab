
/**
 * Lab 5
 * TKRB
 * 
 * Task: 
 * Class for a Person.
 * Preconditions:
 * For set methods: the person has been created.
 * For test methods: the persons have been created and have values for name and age.
 * Postconditions:
 * Set methods: one or both attributes is assigned a value.
 * Test methods: true or false is returned.
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 */
public class PersonTest {

    /**
     * Tests for for the same age (Expect true)
     */
    @Test
    public void testSameAge1() {
        Person a = new Person();
        a.setAge(29);
        Person b = new Person();
        b.setAge(29);
        assertTrue(a.isSameAge(b));
    }

    /**
     * Tests for for the same age (Expect false)
     */
    @Test
    public void testSameAge2() {
        Person a = new Person();
        a.setAge(29);
        Person b = new Person();
        b.setAge(27);
        assertTrue(a.isSameAge(b));
    }

    /**
     * Tests for the same name (Expect true)
     */
    @Test
    public void testSameName1(){
        Person a = new Person();
        a.setName("Rei");
        Person b = new Person();
        b.setName("Rei");
        assertTrue(a.isSameName(b));
    }

    /**
     * Tests for the same name (Expect false)
     */
    @Test
    public void testSameName2(){
        Person a = new Person();
        a.setName("Rei");
        Person b = new Person();
        b.setName("Eri");
        assertTrue(a.isSameName(b));
    }

    /**
     * Tests for the same name (Expect true)
     */
    @Test
    public void testEqual1(){
        Person a = new Person();
        a.set("Rei", 29);
        Person b = new Person();
        b.set("Rei", 29);
        assertTrue(a.equals(b));
    }

    /**
     * Tests for the same name (Expect false)
     */
    @Test
    public void testEqual2(){
        Person a = new Person();
        a.set("Rei", 29);
        Person b = new Person();
        b.set("Eri", 27);
        assertTrue(a.equals(b));
    }

    /**
     * Test if older, expected true
     */
    @Test
    public void testOlderThan1(){
        Person a = new Person();
        a.set("Rei", 29);
        Person b = new Person();
        b.set("Eri", 27);
        assertTrue(a.isOlderThan(b));
    }

    /**
     * Test if older, expected false
     */
    @Test
    public void testOlderThan2(){
        Person a = new Person();
        a.set("Rei", 29);
        Person b = new Person();
        b.set("Eri", 27);
        assertTrue(a.isOlderThan(b));
    }
}
