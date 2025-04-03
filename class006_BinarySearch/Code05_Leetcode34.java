package class006_BinarySearch;

import java.util.Arrays;

// leetcode https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
// leetcode (4) hot100 (3)
public class Code05_Leetcode34 {
    public static int[] searchRange(int[] arr, int num) {

        int l = findLeft(arr, num);
        int r = findRight(arr, num);
        return new int[]{l, r};
    }

    public static int findLeft(int[] arr, int num) {
        int ans = -1;
        if (arr == null || arr.length == 0) {
            return ans;
        }

        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == num) {
                ans = m;
                r = m - 1;
            } else if (arr[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

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
            if (arr[m] == num) {
                ans = m;
                l = m + 1;
            } else if (arr[m] < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        System.out.println("index: " + Arrays.toString(searchRange(array, 8)));
        System.out.println("index: " + Arrays.toString(searchRange(array, 6)));
    }

}
