package class021_MergeSort;

// https://leetcode.com/problems/sort-an-array
// leetcode (17)
public class MergeSort {

    public int[] sortArray(int[] nums) {
        if (nums.length > 1) {
            mergeSort(nums, 0, nums.length - 1);
        }
        return nums;
    }

    public static int MAX = 50001;
    public static int[] help = new int[MAX];

    public void mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return;
        }
        int m = l + (r - l) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);
        merge(nums, l, m, r);
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
