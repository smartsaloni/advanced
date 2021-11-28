import java.util.Scanner;

public class arraydifference {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[50];

        int[] array2 = new int[80];

        int[] diff = new int[110];

        System.out.println("Array Size -");

        int n = sc.nextInt();

        System.out.println("Enter array 1");

        for(int i=0;i<n;i++){


            array1[i] = sc.nextInt();

        }

        System.out.println("Enter array 2");

        for(
            
            int j=0;j<n;j++){
            
            array2[j] = sc.nextInt();
        


        }

        for(int a=0;a<n;a++){

            diff[a] = array1 [a] - array2[a];

        }

        System.out.println("Difference is -  ");

        for(int x=0;x<n;x++){

            System.out.print(diff[x]+"  ");

        }

        sc.close();

    }


}