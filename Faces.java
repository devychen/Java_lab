/**
 * Lab 0-3
 * TKRB
 * Task: write a programme to print a face.
 * Use ASCII characters only.
 */

public class Faces {
    public static void main(String[] args) {
        // Define the layers of the face
        String[] faceLayers = {
                "  \\/-----\\/       |||||||||",
                " |||||||||||     |||||||||||",
                "|||       |||   |||       |||",
                " (| ^   ^ |)      < ^   ^ >",
                " /|   3   |\\      | \\___/ | ",
                "//|_______|\\\\     |_______|",
        };

        // Print the layers of the face
        for (String layer : faceLayers) {
            System.out.println(layer);
        }
    }
}

/*
 * for (elementType element : arrayOrCollection) {
 *    // 循环体内的代码
 * }
 * elementType: 
 * string array - String, int array - int 
 * Arraylist<Integer> - Integer
 * List<String> - String
 */
