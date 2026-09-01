package reverseString_programs;

public class ReverseStringThroughDirectMethod {

    public static void main(String[] args) {

        // Given String
        String str = "Selenium";

        // Convert String into StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // Direct reverse() method
        sb.reverse();

        // Print reversed String
        System.out.println("Reversed String: " + sb);
    }
}