public class countingSort {
    public static void countingSort(int[] arr,int n){
        // First of all we need find the largest element in the array 

        int maxe=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxe){
                maxe=arr[i];
            }
        }

            // take the array of the size max element + 1 and store the 0 in all of ther index
        int[] freq= new int[maxe+1];
        // for(int i=0;i<freq.length;i++){
        //     freq[i]=0;
        // }

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=1;i<freq.length;i++){
            freq[i]= freq[i] + freq[i-1];
        }
        int[] b= new int[n];
        for(int i=n-1;i>=0;i--){
            int element =arr[i];
            b[--freq[arr[i]]]=arr[i];

        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr={2,7,3,4,6,8};
        int n= arr.length;
        countingSort(arr,n);
       
    }
}
