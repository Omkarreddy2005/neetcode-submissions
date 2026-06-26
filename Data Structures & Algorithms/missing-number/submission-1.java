class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0,y=0;
        for(int i=1;i<=n;i++){
            x^=i;
        }
        for(int i=0;i<n;i++){
            y^=nums[i];
        }
        return x^y;
    }
}
