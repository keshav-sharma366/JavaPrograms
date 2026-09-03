package array_programs;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayUsingStream {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] reverse = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();

        System.out.println(Arrays.toString(reverse));
    }
}