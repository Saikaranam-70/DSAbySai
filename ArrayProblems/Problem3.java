/*
 * Given an Array of numbers the task is to find minimum number from that array
 * Example:-
 *      Input:- arr = {10,9,8,7,6,5};
 *      Output :- 5
 */

package ArrayProblems;

public class Problem3 {
    public int minNumInArray(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int myArray[] = {10,9,8,7,6,5};
        Problem3 pr3 = new Problem3();
        int result = pr3.minNumInArray(myArray);
        System.out.println("Minimum Number is : "+result);
    }
}
