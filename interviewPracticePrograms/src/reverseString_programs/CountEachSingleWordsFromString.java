package reverseString_programs;

public class CountEachSingleWordsFromString {
	public static void countWord(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			count++;
		}
		System.out.println("The all words in given string are :"+count);
	}
	public static void main(String[] args) {
		String str="java is very easy programming language";
		countWord(str);
	}
}
