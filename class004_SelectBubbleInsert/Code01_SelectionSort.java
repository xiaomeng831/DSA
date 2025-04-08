package class004_SelectBubbleInsert;

public class Code01_SelectionSort {

    // 选择排序
    public static void selectSort(int[] arr) {
        // 三种情况: arr为null, 空数组(长度为0), 数字长度为1
        // arr为null时: 没有分配内存地址; 访问会抛出空指针异常
        // arr为空数组时: 有内存地址, 但占用内存长度为0; 可以遍历
        if (arr == null || arr.length < 2) {
            return;
        }

        // 1.控制进度 2.minIndex初始位置 3.最后的交换
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            // 进行比较, 确定minIndex的最终位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
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
        int[] array = { 5, 1, 4, 2, 8 };
        System.out.println("选择排序前：");
        printArray(array);
        selectSort(array);
        System.out.println("选择排序后：");
        printArray(array);

    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}