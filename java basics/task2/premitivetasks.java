
    import java.util.Scanner;
    class premitivetasks{
        public static void main(String[] args){
            Scanner Sc = new Scanner(System. in);
            System.out.println("enter your name");
            String name = Sc.nextLine();
            System.out.println("you have entered: "+name );
            System.out.print("enter your age:");
            int age = Sc.nextInt();
            System.out.println("your age is: "+age);
            System.out.print("enter your account balance:");
            int balance = Sc.nextInt();
            System.out.println("your balance is: "+ balance);
            Sc.close();
        }
    }  
