public class ArrayUtil {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;
        myArray[2] = 9; //Update
        
        printArray(myArray);
    }
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
