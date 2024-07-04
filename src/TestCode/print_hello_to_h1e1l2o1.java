package TestCode;

public class print_hello_to_h1e1l2o1 {

    public static void main(String[] args) {
        String s = "hello";
        int[] counts = new int[256]; // Assuming ASCII characters

        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }

        // Print each character with its count
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (counts[currentChar] != 0) {
                System.out.print(currentChar + "" + counts[currentChar]);
                counts[currentChar] = 0; // Set count to 0 to avoid printing again
            }
        }
    }
}
