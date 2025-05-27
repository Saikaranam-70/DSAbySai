/*
 * Given an Array of integers return second maximum value.
 * Example:-
 *         Input:- arr={12, 34, 2,34,33,1}
 *         Output:- 33
 */



public class Problem4 {
    int findSecondMax(int[] arr){
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]> secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] myArray = {13, 34, 2,34,33,1};
        Problem4 pr4 = new Problem4();
        int result = pr4.findSecondMax(myArray);
        System.out.println("Second Maximum : "+ result);
    }
}
