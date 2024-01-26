import java.lang.reflect.Array;

/**
 * Lab 8
 * TKRB
 * 
 * Task:
 * Create a class ArrayUtils that 
 * implements seceral helper methods for arrays
 * Documentation: file:///Users/ychen/Java_lab/ArrayUtils.html.
 */

public class ArrayUtils {
    
    /**
     * Returns a new array with the reversed members of anArray
     * @param anArray The array to reverse
     * @return An array with the reversed members of anArray
     */
    public static Object[] reverseArray(Object[] anArray){
        if (anArray == null) {
            throw new IllegalArgumentException("Input array must not be null");
        }

        Object[] reverseArray = new Object[anArray.length];
        for (int i = 0; i < anArray.length; i++) {
            reverseArray[i] = anArray[anArray.length - 1 - i];
        }
        return reverseArray;

        // A B C D E
        // 0 1 2 3 4
        // E D C B A
        // 0 1 2 3 4
        // 0 - 4; 1 - 3; 2 - 2; 3 - 1; 4 - 0 
    }

    /**
     * Returns an array with the concatenation of array1 and array2
     * @param array1 first array
     * @param array2 Second array
     * @return The concatenation of array1 and array2
     */
    public static Object[] concatArrays(Object[] array1, Object[] array2){
        if (array1 == null || array2 == null){
            throw new IllegalArgumentException("Input array must not be null");
        }

        Object[] concatArray = new Object[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            concatArray[i] = array1[i];
        }
        for(int j = 0; j < array2.length; j++){
            concatArray[j + array1.length] = array2[j];
        }

        return concatArray;
    }

    /**
     * Returns the index of the (first) occurence of object aObject 
     * in array anArray 
     * or -1 when aObject is not contained in anArray
     * @param anArray Heystack
     * @param aObject Needle
     * @return Index in anArray or -1 when not found.
     */
    public static int searchArrayForAnObject(Object[] anArray, Object aObject){
        for (int i = 0; i < anArray.length; i++){
            if(aObject.equals(anArray[i])){     //NO ==, that's for memory address
                return i;
            }
        }
        return -1;
    }
}
