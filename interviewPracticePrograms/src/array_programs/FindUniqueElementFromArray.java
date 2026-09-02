package array_programs;

public class FindUniqueElementFromArray {
	public static void main(String[] args) {
		int[] arr= {50,10,20,30,40,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Unique element :"+arr[i]);
			}
		}
	}

}
