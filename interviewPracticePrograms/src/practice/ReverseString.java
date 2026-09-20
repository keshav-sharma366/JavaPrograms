package practice;

public class ReverseString {
	public static void main(String[] args) {
		String str="welcome";
		char[] arr=str.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(new String(rev));
	}

}
