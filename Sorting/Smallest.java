import java.util.*;
public class Smallest {
    public static void main(String[] args){
        int[] arr={5,6,1,89,4,9,3};
        for(int i=0;i<arr.length;i++){
            
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minindex]){
                    minindex=j;
                }
                
            } 
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            
        }
        System.out.println("Elements are sorting after applying selection sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
