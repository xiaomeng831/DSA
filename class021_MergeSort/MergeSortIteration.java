package class021_MergeSort;

// https://leetcode.com/problems/sort-an-array
// leetcode (17)
public class MergeSortIteration {
    public int[] sortArray(int[] nums) {
        if (nums.length > 1) {
            mergeSort(nums);
        }
        return nums;
    }

    public static int MAXN = 50001;
    public static int[] help = new int[MAXN];

    public void mergeSort(int[] nums) {
        int n = nums.length;
        for (int l, m, r, step = 1; step < n; step <<= 1) {
            l = 0;
            while (l < n) {
                m = l + step - 1;
                if (m + 1 >= n) {
                    break;
                }
                r = Math.min(l + (step << 1) - 1, n - 1);
                merge(nums, l, m, r);
                l = r + 1;
            }
        }
    }

    public void merge(int[] nums, int l, int m, int r) {
        int i = l;
        int a = l;
        int b = m + 1;
        while (a <= m && b <= r) {
            help[i++] = nums[a] <= nums[b] ? nums[a++] : nums[b++];
        }
        while (a <= m) {
            help[i++] = nums[a++];
        }
        while (b <= r) {
            help[i++] = nums[b++];
        }
        for (i = l; i <= r; i++) {
            nums[i] = help[i];
        }
    }
}
