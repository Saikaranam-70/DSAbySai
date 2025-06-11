package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int target = 99;

        int result = binarySearch(arr, target);
        if(result != -1){
            System.out.println("Target Found At Index :"+result);
        }else{
            System.out.println("Target Not Found");
        }
        
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = (start+end) /2;

            if(arr[mid] == target){
                return mid;
            }else if(target < mid){
                end = mid -1;
            }else{
                start = mid +1;
            }
            
        }
        return -1;
    }
}
