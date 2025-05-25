/*
 * Given an array of integers write a function to move all 0's to end of it while maintaining the relative
 * order of the non zero elements
 * 
 * Input={0,1,0,4,12}
 * Output:-{1,4,12,0,0}
 */

package ArrayProblems;

public class Problem5 {
    public int[] moveZeros(int[] arr, int n){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] !=0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myArray = {0,1,0,4,12};
        Problem5 pr5 = new Problem5();
        int result[] = pr5.moveZeros(myArray, myArray.length);
        for(int i: result){
            System.out.println(i);
        }
    }
}
