public class swaparray {
    public static void main(String[]args){

        int [] arr = {13,12,15,6,8,13,20};
        int n = arr.length;
        int j  = n-1, i= 0;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
      
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);

        }
    }
}
