public class Selection_Sort{
    public static void main(String[] args) {
        
        int arr[] = {2,9,3,8,4,7,5,6};
        int min =-1;

        System.out.println("Before Sorting :");
        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();

        for(int i =0; i<arr.length;i++){
            min = i;
           for(int j=i+1; j<arr.length;j++){
             if(arr[j] < arr[min]){
                min = j;
            }
           }
           int temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;
        }
        System.out.println("After Sorting :");
        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}