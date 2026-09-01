package reverseString_programs;

public class CountWordsUsingMethod {
	public static void countWords(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' '&&(i==0 || str.charAt(i-1)==' '))
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str="java is very easy language";
		countWords(str);
	}

}
