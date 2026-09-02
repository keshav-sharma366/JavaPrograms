package array_programs;

public class ReverseArrayWithoutAnyOtherArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,40};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int value:arr)
		{
			System.out.print(value+" ");
		}
	}

}
