/*
 * Resize An Array
 */


package ArrayProblems;

public class Problem6 {
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i =0;i<arr.length;i++){
            temp[i] = arr[i];

        }
        arr=temp;
        return arr;
    }
    public static void main(String[] args) {
        int myArray[] = new int[5];
        System.out.println("Before Resize : "+myArray.length);
        Problem6 pr6 = new Problem6();
        int result[] = pr6.resize(myArray, 8); 
        System.out.println("After Resize : "+result.length);
    }
}
