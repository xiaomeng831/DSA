package class004_SelectBubbleInsert;

public class Code02_BubbleSort {

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        // 1.控制轮次, 有n个元素, 需要做n-1{轮}比较
        // 2.体现每轮剩余未排序的部分
        for (int end = arr.length - 1; end > 0; end--) {

            // 内循环: 每一轮, 有n个元素未排序, 要做n-1{次}比较
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
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
        int[] array = { 4, 3, 2, 2, 8 };
        System.out.println("冒泡排序前：");
        printArray(array);
        bubbleSort(array);
        System.out.println("冒泡排序后：");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}