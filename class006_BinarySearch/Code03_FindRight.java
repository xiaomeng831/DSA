package class006_BinarySearch;

// 有序数组中找<=num的最右位置
public class Code03_FindRight {

    public static int findRight(int[] arr, int num) {
        int ans = -1;
        if (arr == null || arr.length == 0) {
            return ans;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] <= num) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    //run
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 2, 4, 4, 7, 8};
        System.out.println("index: " + findRight(array, 1));
    }
}
