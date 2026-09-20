package practice;

public class RevEachWord {
	public	static	void	main(String[]	args)	{
		String	str	=	"Java	is	fun";
		String[]	words	=	str.split("	");
		StringBuilder	result	=	new	StringBuilder();
		
		for	(String	word	:	words)	
		{
		String	reversedWord	=	new	StringBuilder(word).reverse().toString();
		result.append(reversedWord).append("	");
		}
		System.out.println("Result:	"+result.toString().trim());
	}
}
