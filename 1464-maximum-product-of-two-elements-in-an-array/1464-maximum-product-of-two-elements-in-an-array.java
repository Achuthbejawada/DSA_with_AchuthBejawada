class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int value=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
             value = (nums[i] - 1) * (nums[j] - 1);
        
            max = Math.max(max,value);
            }
        }
        return max;
    }
}