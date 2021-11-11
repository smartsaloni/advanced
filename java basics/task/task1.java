import java.util.Scanner;
class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("you have entered: "+name );
        System.out.print("enter your age:");
        int age = sc.nextInt();
        System.out.println("your age is: "+age);
        sc.close();
    }
}