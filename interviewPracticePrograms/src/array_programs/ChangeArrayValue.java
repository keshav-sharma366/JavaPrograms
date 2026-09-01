package array_programs;

public class ChangeArrayValue {
    public static void main(String[] args) {

        int[] arr = {10, 20, 32, 40};
        // Change 3rd array value from 32 to 5
        arr[2] = 5;

       // System.out.println(java.util.Arrays.toString(arr));
        for (int value : arr) {
            System.out.print(" "+value);
        }
    }
}

