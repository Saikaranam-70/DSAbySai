public class Quick_Sort {

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

    return i+1;
    }

    public static void quick_Sort(int[] arr, int low, int high){
        if(low< high){
            int pivot = partition(arr, low, high);
            quick_Sort(arr, low, pivot-1);
            quick_Sort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,9,3,8,4,7,5,6};
        System.out.println("Before Sorting :");
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
        quick_Sort(arr, 0, arr.length-1);
        System.out.println("After Sorting :");
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
