//1(b) Binary Search

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,9,11,15,20};
        int left=0;
        int right=arr.length-1;
        int key=11;
        int result=binarySearch(arr,left,right,key);
        if (result==-1){
            System.out.println("Element not found at Index");
        }

        else{
            System.out.println("Element found at Index "+result);
        }
    }

    static int binarySearch(int[] arr,int left,int right,int key){
        if (left<right){
            int mid=(left+right)/2;

            if (arr[mid]==key){
                return mid;
            }

            else if (arr[mid]<key) {
                return binarySearch(arr,mid+1,right,key);
            }

            else{
                return binarySearch(arr,left,mid-1,key);
            }
        }
        return -1;
    }
}
