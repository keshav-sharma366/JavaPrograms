package reverseString_programs;

public class CountDuplicatesFromString {
	public static void main(String[] args) {
		String str="Selenium";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					count++;
			}
		}
		System.out.println("Duplicates times of word is :"+count);
	}

}
