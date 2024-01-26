/**
 * Lab 8
 * TKRB
 * 
 * Task: 
 */

import static org.junit.Assert.*;

import org.junit.*;

public class ArrayUtilsTest {
    /**
     * Test for reverseArray
     */
    @Test
    public void testReverseArray(){
        String[] a1 = {"A", "B", "C", "D"};
        String[] expected = {"D", "C", "B", "A"};
        Object[] res = ArrayUtils.reverseArray(a1);
        assertNotNull(res);
        assertArrayEquals(res, expected);
    } 

    /**
     * Test for concatArrays
     */
    @Test
    public void testConcatArrays(){
        String[] a1 = {"A", "B", "C", "D"};
        String[] a2 = {"E", "F", "G", "H"};
        String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Object[] res = ArrayUtils.concatArrays(a1, a2);
        assertNotNull(res);
        assertArrayEquals(expected, res);
    }

    /**
     * Test for searchArrayForAnObject
     */
    @Test
    public void searchArrayForAnObject(){
        String[] a1 = {"A", "B", "C", "D"};
        Object a = "B";
        int expectedIndex = 2;
        int resIndex = ArrayUtils.searchArrayForAnObject(a1, a);
        assertNotNull(resIndex);
        assertEquals(expectedIndex, resIndex);
    }

}

