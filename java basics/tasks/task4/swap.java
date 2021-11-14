package task4;
import java.util.*;  
public class swap {
   public static void main(String[]arg){
       int a,b , temp;
    
    Scanner sc = new Scanner(System.in);
       
    System.out.println("enter the value of a & b");
        
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("before swaping your numbers -:"+a+" "+b );
     temp=a;
      a=b;
      b=temp;
      
        System.out.println("after swaping byour numbers -:"+a+ " " +b );
        System.out.println();
        sc.close();

 
    }
}