public class arrays {
     public static void main(String[] args) {

         int[] arr = {13,15,6,8,3,13,20};

         int n = arr.length;

         int j = n-1;;

         int [] result = new int[n];

         for (int i= 0; i<n; i++){

             result [i] = arr[j];

             j--;

         }


        for (int k = 0;k<n;k++){
            
            System.out.println(result[k]);
            

        }
    }
}
