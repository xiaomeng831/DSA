package class006_BinarySearch;

// 有序数组中找>=num的最左位置
public class Code02_FindLeft {

    public static int findLeft(int[] arr, int num) {
        // leetcode 35 https://leetcode.com/problems/search-insert-position/
        // leetcode (2) hot100 (2)
        // 如果num比所有元素都大，插入到最后
        // int ans = arr.length
        int ans = -1;
        if (arr == null || arr.length == 0) {
            return ans;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] >= num) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    //run
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 2, 4, 4, 7, 8};
        System.out.println("index: " + findLeft(array, 4));
    }
}
