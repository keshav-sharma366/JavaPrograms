package array_programs;

public class ThirdLargest {
	public static void main(String[] args) {
// sort array into descending order and then access value of arr[2]
// sort array into assecending order and then access value of arr[3]
		int[] arr = { 10, 25, 7, 45, 32, 50 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[3]);
		//System.out.println("3rd largest: " + arr[2]);

	}
}
