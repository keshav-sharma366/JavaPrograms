package reverseString_programs;

public class ReverseStringType4 {
    public static void main(String[] args) {

        String str = "Hello World";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}