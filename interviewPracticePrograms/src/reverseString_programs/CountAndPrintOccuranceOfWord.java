package reverseString_programs;

public class CountAndPrintOccuranceOfWord {
	public static void main(String[] args) {
		String str="communication";
		char ch='c';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
				System.out.println(ch);
				
			}
		}
		System.out.println(count+":times of repeat occurance");
	}

}
