package array_programs;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,10,30,20,40,50,60,10};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
		}
		System.out.println("total duplicates in array :"+count);
	}
	
	

}
