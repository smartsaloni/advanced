import java.util.Scanner;

public class wordsearch {
	public static void main(String[] args) 
    
	{

		Scanner sc  = new Scanner(System.in);

		String x="";	

		System.out.println("Enter your content:");

		x=sc.nextLine();

		String y="";	

		System.out.println("enter your word to be searched  ");

		y=sc.nextLine();

		int z=x.indexOf(y);

		if(z==-1)

			System.out.println("there is no word that you finding for");

		else

			System.out.println("there is your word at number"+z);

            sc.close();
	}
    
}