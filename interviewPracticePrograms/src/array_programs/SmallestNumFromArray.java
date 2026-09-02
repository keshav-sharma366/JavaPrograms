package array_programs;

public class SmallestNumFromArray {
	public static void main(String[] args) {
		int []arr= {10,2,50,30,99,1};
		int min=arr[0]; //int min=10;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("smallest Number in array is :"+min);
	}

}
