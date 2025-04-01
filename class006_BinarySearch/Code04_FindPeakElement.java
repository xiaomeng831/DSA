package class006_BinarySearch;

//leetcode 162 https://leetcode.com/problems/find-peak-element/
public class Code04_FindPeakElement {

    public static int findPeakElement(int[] arr) {
        int ans = -1;
        if (arr == null) {
            return ans;
        }
        if (arr.length == 1 || arr[0] > arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int l = 1;
        int r = arr.length - 2;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m - 1] > arr[m]) {
                r = m - 1;
            } else if (arr[m] < arr[m + 1]) {
                l = m + 1;
            } else {
                ans = m;
                return ans;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("index: " + findPeakElement(array));
    }
}
