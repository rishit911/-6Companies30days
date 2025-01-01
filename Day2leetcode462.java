class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int avg=nums[nums.length/2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(avg<nums[i]){
                count+=nums[i]-avg;
            }else if(avg>nums[i]){
                count+=avg-nums[i];
            }
        }
        return count;
    }
}
