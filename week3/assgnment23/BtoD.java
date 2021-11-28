import java.util.Scanner;

public class BtoD {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("BINARY INPUT-");

		int num=sc.nextInt();

		int N=0,sum=0;

		while(num!=0)

	       {
	    	  sum+=(num%10)*Math.pow(2, N);

	    	  num=num/10;

	    	  N++;
	       }
           
	       System.out.println("DECIMAL OUTPUT-"+sum);

           sc.close();
	}

}