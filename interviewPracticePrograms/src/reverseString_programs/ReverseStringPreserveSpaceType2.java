package reverseString_programs;

public class ReverseStringPreserveSpaceType2 {

    public static void main(String[] args) {

        String str = "java avaj";

        char[] arr = str.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // Left side space ko skip karo
            if (arr[i] == ' ') {
                i++;
                continue;
            }

            // Right side space ko skip karo
            if (arr[j] == ' ') {
                j--;
                continue;
            }

            // Characters swap karo
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(new String(arr));
    }
}