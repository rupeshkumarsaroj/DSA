public class merge {

    public static void mergeSort(int[] arr,int low,int high)
    {
        while(low>=high){
            return;
        }
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int[] temp= new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i <= mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;

            }
            else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(k=0,i=low;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args){
        int[] arr={12,5,4,8,9};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
