class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean []pick=new boolean[nums.length];
        rec(ans,list,nums,pick);
        return ans;
    }
    public void rec(List<List<Integer>> ans,List<Integer> list,int []nums,boolean []pick){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!pick[i]){
                list.add(nums[i]);
                pick[i]=true;
            rec(ans,list,nums,pick);
            list.remove(list.size()-1);
            pick[i]=false;
            }
        }
    }
}
