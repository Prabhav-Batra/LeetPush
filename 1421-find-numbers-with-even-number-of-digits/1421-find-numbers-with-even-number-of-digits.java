class Solution {
    public int findNumbers(int[] nums) {
        int count  = 0; 
        int n = nums.length;
        for (int i = 0 ; i<n; i++){
            String m = Integer.toString(nums[i]);
            if (m.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}