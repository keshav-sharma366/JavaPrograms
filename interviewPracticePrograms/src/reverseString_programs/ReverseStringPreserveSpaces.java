package reverseString_programs;

public class ReverseStringPreserveSpaces {
    public static void main(String[] args) {

        String str = "Hello Worlds";
        char[] arr = str.toCharArray();

        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ')
                continue;

            while (arr[j] == ' ')
                j--;

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            j--;
        }

        System.out.println(new String(arr));
    }
}