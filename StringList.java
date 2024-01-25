/**
 * Lab 6
 * TKRB
 * 
 * Task: add given methods
 * Example output:
 * String[] expected = {"AA","BB","CC"};
 * String[] res = testList.toArray();
 * assertTrue(expected.length == res.length);
 * for (int i=0;i<res.length;i++)  {
 * assertEquals(res[i],expected[i]);
 * }
 */

public class StringList {

    private static final int INITIAL_SIZE = 3; // initial size if none is given in constructor
    private int numElements; // number of elements currently in list
    protected static String[] list; // array instance variable

    public StringList() {
        numElements = 0;
        list = new String[INITIAL_SIZE];
    }

    public StringList(int initialSize) {
        numElements = 0;
        list = new String[initialSize];
    }

    public void add(String item) {
        // transfer list to a larger array when full
        if (numElements == list.length) {
            String[] tmp = new String[numElements + INITIAL_SIZE];

            for (int i = 0; i < numElements; i++) {
                tmp[i] = list[i];
            }

            list = tmp;
        }

        // add item
        list[numElements] = item;
        numElements++;
    }

    public boolean contains(String item) {
        boolean found = false;

        for (int i = 0; (i < numElements) && !found; i++) {
            if (list[i].equalsIgnoreCase(item)) {
                found = true;
            }
        }

        return found;
    }

    public String get(int index) {
        String result = null;

        if ((index >= 0) && (index < numElements)) {
            result = list[index];
        }

        return result;
    }

    /**
     * Insert String item at position index
     * @param index
     * @param item
     */
    public void insertAt(int index, String item) {
        // ensure capacity
        if (numElements == INITIAL_SIZE){
            String[] tmp = new String[numElements + INITIAL_SIZE];
            for (int i = 0; i < numElements; i++){
                tmp[i] = list[i];
            }
            list = tmp;
        }
        // Make space for the new item
        for(int j = numElements - 1; j >= index; j--){  // from last to index, move right
            list[j + 1] = list[j];                      // value of new last(last+1) = value old last
                    // A 'B' C  D  E
                    // 0 '1' 2  3  4
                    // A  X  B  C  D  E
                    // 0  1  2  3  4  5
                    // 现在的[5]是原来的[4]
        }
        // Insert item
        list[index] = item; 
        // Update numElements
        numElements++;
    }

    /**
     * Remove String item from the list
     * @param item
     * @return true when item was successfully removed, false otherwise
     */
    public boolean remove(String item)  {
        for (int i = 0; i >= 0; i++){
            if(list[i].equalsIgnoreCase(item)){
                for(int j = i; j < numElements - 1; i++){  // from i to last(ie.numElements-1), move left
                    list[j] = list[j + 1];

                    // A 'B' C  D  E
                    // 0 '1' 2  3  4
                    // A  C  D  E
                    // 0  1  2  3
                    // 现在的[1]（index 1的值）是原来的[2]
                }
                // Set last element to null, update numElements
                list[numElements-1] = null;
                numElements--;
                return true;
            }
        }
        // item not found
        return false;
    }

    /**
     * Returns the content as an array of Strings
     * Copy every non-null element in list into an array
     * @return the content as an array of Strings
     */
    public String[] toArray(){
        String[] rval = new String[numElements];
        for (int i = 0; i < numElements; i++){
            rval[i] = list[i];
        }
        // directly return, no need to re-assign to instance variable 'list'.
        return rval;
    }

}