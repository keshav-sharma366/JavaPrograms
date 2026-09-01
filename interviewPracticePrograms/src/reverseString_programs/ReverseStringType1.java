package reverseString_programs;

public class ReverseStringType1 {

    public static void main(String[] args) {

        // given string is "Selenium"
        String s = "SELENIUM";

        // convert to char array first to apply loop
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // apply while loop
        while (left < right) {

            // container to swap values between left and right
            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            // move left forward
            left++;

            // move right backward
            right--;
        }

        // convert char array back to String and print
        System.out.println(new String(arr));
    }
}