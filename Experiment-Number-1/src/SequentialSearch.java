//1(a).Sequential Search

public class SequentialSearch {

    public static void main(String[] args) {
        int[] arr={6,1,8,2,3,0};
        int key=2;
        int result=search(arr,key);

        if (result==-1){
            System.out.println("Element Not Found at index ");
        }

        else{
            System.out.println("Element found at Index "+result);
        }
    }

    static int search(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
