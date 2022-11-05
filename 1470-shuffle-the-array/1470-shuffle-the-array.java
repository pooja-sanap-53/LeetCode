class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int k = 0;
        for (int i = 0; i < 2 * n; i+=2){
                ans[i] = nums[k];
                k++;
        }
        
        int j = n;
        for (int i = 1; i < 2 * n; i+=2){
                ans[i] = nums[j];
                j++;
            }
        
        return ans;
    }
}