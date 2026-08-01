class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<Integer>();
        int sum=0;
        rec(ans,list,nums,0,sum,target);
        return ans;
    }
    public void rec(List<List<Integer>> ans,List<Integer> list,int[] nums,int i, int sum, int target){
        if(sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i==nums.length) return;
        list.add(nums[i]);
        rec(ans,list,nums,i,sum+nums[i],target);
        list.remove(list.size()-1);
        rec(ans,list,nums,i+1,sum,target);
    } 
}
