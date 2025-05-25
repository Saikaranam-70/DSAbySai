/*
 * Given an Array of integers and return an array with even integers removed 
 * example:-
 *       input: arr = {3,2,4,7,10,6,5}
 *       output: arr={3,7,5}
 */

package ArrayProblems;

public class Problem1 {
    int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] % 2 !=0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] myArray = {3,2,4,7,10,6,5};
        Problem1 pr1 = new Problem1();
        int[] result = pr1.removeEven(myArray);
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
