
/*
 * Given an array of n-1 integers in the range of 1 to n, find the missing number.
 * Example:-
 *       Input: arr = {2,4,1,8,6,3,7}
 *       Output: 5
 *       Explanation: The array contains numbers from 1 to 8, and the missing number is 5.
 */

package ArrayProblems;
public class Problem7 {
    public int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int i=0; i<arr.length;i++){
            sum = sum-arr[i];
        
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] myArray = {2,4,1,8,6,3,7};
        Problem7 pr7 = new Problem7();
        int result = pr7.findMissingNumber(myArray);
        System.out.println("The Missing Number is :" + result);
        
    }
}
