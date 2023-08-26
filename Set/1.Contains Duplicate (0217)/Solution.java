// Set中的元素唯一
// HashMap中的key唯一
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
	        if(hashSet.contains(nums[i])){
		        return true;
	        }
	    hashSet.add(nums[i]);
        }
        return false;
    }
}
