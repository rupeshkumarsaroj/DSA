public class quickSort {
    public static void quick(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdx;
        pIdx = partition(arr,si,ei);
        quick(arr,si,pIdx-1);
        quick(arr,pIdx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){

            if(arr[j] <= pivot){

                i++;
                int temp=arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args){
        int[] arr ={5,4,9,2,7};
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
