public class Code01_SelectionSort {


    public static void selectionSort(int[] arr){

        if(arr == null || arr.length < 2) return;

        for(int i = 0; i < arr.length - 1; i++){
            int minValueIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                minValueIndex = arr[minValueIndex] < arr[j] ? minValueIndex : j;
            }

            swap(arr, i, minValueIndex);
        }
        
        return;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 100, 9, 8, 52, 42, 3, 5};

        selectionSort(arr);

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }

}
