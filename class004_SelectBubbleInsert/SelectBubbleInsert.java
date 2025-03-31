package class004_SelectBubbleInsert;

public class SelectBubbleInsert{

    //选择排序
    public static void selectSort(int[] arr){
        //三种情况: arr为null, 空数组(长度为0), 数字长度为1
            //arr为null时: 没有分配内存地址; 访问会抛出空指针异常
            //arr为空数组时: 有内存地址, 但占用内存长度为0; 可以遍历
        if(arr== null || arr.length < 2){
            return;
        }

        //1.控制进度 2.minIndex初始位置 3.最后的交换
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;

            //进行比较, 确定minIndex的最终位置
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        //1.控制轮次, 有n个元素, 需要做n-1{轮}比较
        //2.体现每轮剩余未排序的部分
        for(int end = arr.length - 1; end > 0; end--){

            //内循环: 每一轮, 有n个元素未排序, 要做n-1{次}比较
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        //控制轮数, n个数需要n-1轮
            //第一轮要做到 0 ~ 1 做到有序
            //第二轮要做到 0 ~ 2 做到有序
            //...
        for(int i = 1; i < arr.length; i++){
            //0 ~ i-1有序, 新来的数是arr[i], 向左看
            //每次比较j和j+1的元素大小, arr[j] > arr[j + 1]就交换, 每次比较结束后j和j+1都向左移
            //当j<0说明到头了, 当arr[j]<arr[j + 1]说明有序了, 则停止循环
            for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr, j, j + 1);
            }
        }

    }

    //交换
    public static void swap(int[] arr, int i, int j){
        int temp = arr [i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //run
    public static void main(String[] args) {
        int[] array1 = {5, 1, 4, 2, 8};
        System.out.println("选择排序前：");
        printArray(array1);
        selectSort(array1);
        System.out.println("选择排序后：");
        printArray(array1);

        int[] array2 = {4, 3, 2, 2, 8};
        System.out.println("冒泡排序前：");
        printArray(array2);
        bubbleSort(array2);
        System.out.println("冒泡排序后：");
        printArray(array2);

        int[] array3 = {7, 5, 4, 6, 8};
        System.out.println("插入排序前：");
        printArray(array3);
        insertSort(array3);
        System.out.println("插入排序后：");
        printArray(array3);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}