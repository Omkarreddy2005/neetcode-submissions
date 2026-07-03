class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
       int i=0,temp=nums[i],max=0,count=0;
       while(i<n){
        if(temp!=nums[i]){
            temp=nums[i];
            count=0;
        }
        while(i<n && nums[i]==temp){
            i++;
        }
        count++;
        temp++;
        max=Math.max(max,count);
       }
       return max;
    }
}
