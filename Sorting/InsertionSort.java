class InsertionSort{
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            int element= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> element){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= element;
        }

        System.out.println("After applying insertion Sort The array element are: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}