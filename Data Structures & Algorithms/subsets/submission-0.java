class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
       return  rec(res,list,nums,0);
    }
    public List<List<Integer>> rec(List<List<Integer>> ans,List<Integer> list,int[] nums,int i){
        if(nums.length==i){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[i]);
        rec(ans,list,nums,i+1);
        list.remove(list.size()-1);
        rec(ans,list,nums,i+1);
        return ans;
    }
}
