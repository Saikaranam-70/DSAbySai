/*
 * Given an Array or Strings the task is to reverse the array to strings
 * example:- 
 *          arr = {2,11,5,10,7,8}
 * Solution:-
 *          arr = {8,7,10,5,11,2}
 */



public class Problem2 {
    public int[] reverseArray(int[] arr, int start, int end){
        while(start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myArray = {2,11,5,9,10,7,8};
        Problem2 pr2 = new Problem2();
        int result[] = pr2.reverseArray(myArray, 0, myArray.length-1);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
