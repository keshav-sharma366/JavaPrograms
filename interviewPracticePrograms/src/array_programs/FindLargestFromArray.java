package array_programs;

public class FindLargestFromArray {
	public static void main(String[] args) {
		int[] arr = { 10, 25, 7, 45, 32, 50 };
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest number is :"+max);
	}
	

}
