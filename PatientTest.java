/**
 * Lab 10-1
 * TKRB
 * JUnit test for Class Patient
 * and the newly added method in Class Patient
 */

import static org.junit.Assert.*;

import org.junit.Test;


public class PatientTest {
    
    @Test
    public void testDefaultConstructor(){
        Patient p = new Patient();
        String name = p.getName();
        String ssn = p.getSsn();
        assertEquals("No name yet", name);
        assertEquals("No SSN yet", ssn);
    }

    /**
     * Test name only constructor
     */
    @Test
    public void testNameConstructor(){
        Patient p = new Patient();
        p.setName("Rei");
        assertEquals(p.getName(), "Rei");
    }

    /**
     * Test name and ssn constructor
     */
    @Test
    public void testNameSSNConstructor(){
        Patient p = new Patient("Rei", "111-11-1111");
        assertEquals(p.getName(), "Rei");
        assertEquals(p.getSsn(), "111-11-1111");
    }

    /**
     * Test 2 patients for equality (expected true)
     */
    @Test
    public void testPatientEqual(){
        Patient p1 = new Patient("Rei", "111-11-1111");
        Patient p2 = new Patient("Rei", "111-11-1111");
        assertEquals(p1, p2);
    }

    /**
     * Test 2 patients for inequality, name
     */
    @Test
    public void testPatientNotEqual1(){
        Patient p1 = new Patient("Rei");
        Patient p2 = new Patient("Tooru");
        assertEquals(p1, p2);        
    }

    /**
     * Test 2 patients for inequality, ssn
     */
    @Test
    public void testPatientNotEqual2(){
        Patient p1 = new Patient();
        p1.setSsn("111-11-1111");       // value not assigned, so not 'getSsn'
        Patient p2 = new Patient();
        p2.setSsn("222-22-1112");     
    }

    /**
     * Test 2 patients for inequality, different class
     */    
    @Test
    public void testPatientNotEqual3(){         // ???
        Patient p1 = new Patient("Rei");
        Patient p2 = new Patient();
        p2.setSsn("222-22-2222");
    }

    /**
     * Test toString() method
     */
    @Test
    public void testtoString(){
        Patient p = new Patient("Rei", "111-11-1111");
        System.out.println(p.toString());
    }

    /**
     * Test isValidSsn() method
     */
    @Test
    public void testIsValidSSn(){
        assertTrue(Patient.isValidSsn("111-11-1111"));
        assertFalse(Patient.isValidSsn(null));
        assertFalse(Patient.isValidSsn("11-111-1111"));
        assertFalse(Patient.isValidSsn("abc-de-fghi"));
        // !!! Static method, type Patient should be accessed in a static way
    }
}

