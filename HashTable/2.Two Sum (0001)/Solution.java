class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> prev = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(prev.isEmpty()){
                prev.put(nums[i], i);
            }else if(prev.containsKey(diff)){
                return new int[]{prev.get(diff), i};
            }else{
                prev.put(nums[i], i);
            }
        }

        return new int[2];
    }
}
