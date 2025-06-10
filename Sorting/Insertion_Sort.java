public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {9,2,8,3,7,4,6,5};
        
        System.out.println("Before Sorting :");
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();

        for(int i=1; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 &&key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("After Sorting :");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
