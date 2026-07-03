class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            int count=0;
            while(set.contains(temp)){
                count++;
                temp++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
