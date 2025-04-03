package class006_BinarySearch;

// 普通二分法
// leetcode https://leetcode.com/problems/binary-search/
// leetcode (1) hot100 (1)
public class Code01_FindNumber {

    public static int findNumber(int[] arr, int num) {
        int ans = -1;
        if (arr == null || arr.length == 0) {
            return ans;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            // m = l + ((r - l) >> 1);
            // m = (l + r) / 2; 可能会溢出
            if (arr[m] == num) {
                ans = m;
                // 如果这里没有对l, r的操作; 也没有return
                // 必然会死循环
                return ans;
            } else if (arr[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    // run
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 7, 8 };
        System.out.println("index: " + findNumber(array, 8));
    }

}
