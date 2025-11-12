//1(c) Selection Sort

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,1,4,2,0,5};
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("Array After Sorting : "+Arrays.toString(arr));
    }

    static int[] selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        return arr;
    }
}
