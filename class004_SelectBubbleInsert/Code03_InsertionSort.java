package class004_SelectBubbleInsert;

public class Code03_InsertionSort {

    // 插入排序
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 控制轮数, n个数需要n-1轮
        // 第一轮要做到 0 ~ 1 做到有序
        // 第二轮要做到 0 ~ 2 做到有序
        // ...
        for (int i = 1; i < arr.length; i++) {
            // 0 ~ i-1有序, 新来的数是arr[i], 向左看
            // 每次比较j和j+1的元素大小, arr[j] > arr[j + 1]就交换, 每次比较结束后j和j+1都向左移
            // 当j<0说明到头了, 当arr[j]<arr[j + 1]说明有序了, 则停止循环
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

    }

    // 交换
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // run
    public static void main(String[] args) {
        int[] array = { 7, 5, 4, 6, 8 };
        System.out.println("插入排序前：");
        printArray(array);
        insertSort(array);
        System.out.println("插入排序后：");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}