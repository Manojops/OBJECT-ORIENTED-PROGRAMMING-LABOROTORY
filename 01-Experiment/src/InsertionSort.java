//1(d) Insertion Sort

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,7,2,1,3,6,0,4};
        System.out.println("Array Before Sorting : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array After Sorting : "+ Arrays.toString(arr));
    }

    static int[] insertionSort(int[] arr){
        int n=arr.length;
        for (int i = 1 ; i < n; i++) {
            int key = arr[i];   //unsorted part
            int j=i-1; //last element of the sorted part

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
