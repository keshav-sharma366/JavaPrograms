package reverseString_programs;

public class ReverseString {
	public static void main(String[] args) {
		String str="Welcome to TCS India";
		String word="";
		for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') 
            {
                word = str.charAt(i) + word;
            } 
            else 
            {
                System.out.print(word + " ");
                word = "";
            }
        }

        // Print first word
        System.out.print(word);
	}

}
