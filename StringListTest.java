import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class StringListTest {
    
    StringList testList;
    
    @Before
    public void setUp()
    {
        testList = new StringList(3);
        testList.add("Hallo");
        testList.add("schoene");
        testList.add("Welt");
    }
    
    @After
    public void tearDown()
    {
        testList = null;
    }
   
    
    /**
     * Test the StringList without modifications.
     */
    @Test
    public void test1() {
        String expected = "[Hallo, schoene, Welt]";
        String res = testList.toString();
        assertEquals(expected,res);
    }
    
    @Test
    public void test2() {
        String[] expected = {"Hallo", "schoene", "bunte", "Welt"}; 
        testList.insertAt(2,"bunte");
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res));
    }
    
    @Test
    public void test3() {
        String[] expected = {"Hallo","Welt"};
        boolean res2 = testList.remove("schoene");
        assertTrue(res2);
        String[] res = StringList.list; 
        assertTrue(Arrays.equals(expected, res));
    }
    
    @Test
    public void test4() {
        String[] expected = {"Hallo","schoene" ,"Welt"};
        boolean res2 = testList.remove("blubber");
        assertFalse(res2);
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res)); 
    }
    
    @Test
    public void test5() {
        String[] expected = {"schoene" ,"Welt"}; 
        boolean res2 = testList.remove("Hallo");
        assertTrue(res2);
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res)); 
    }
    
    @Test
    public void test6() {
        String[] expected = {"Hallo", "schoene"}; 
        boolean res2 = testList.remove("Welt");
        assertTrue(res2);
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res)); 
    }
    
    @Test
    public void test7() {
        String[] expected = {"Oh", "Hallo", "schoene", "Welt"}; 
        testList.insertAt(0,"Oh");
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res)); 
    }
    
    @Test
    public void test8() {
        String[] expected = {"Hallo","schoene", "Welt", "Oh"};
        testList.insertAt(3,"Oh");
        String[] res = StringList.list;
        assertTrue(Arrays.equals(expected, res));  
    }
    
    @Test
     public void test9()  {
         String[] expected = {"Hallo", "schoene", "Welt"};
         String[] res = testList.toArray();
         assertArrayEquals(expected,res);
         assertTrue(expected.length == res.length);
         for (int i = 0; i < res.length; i++) {
             assertEquals(res[i], expected[i]);
         }
     }
}


