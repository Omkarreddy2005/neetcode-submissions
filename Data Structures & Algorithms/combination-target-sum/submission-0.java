class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int sum=0;
        List<Integer> list1=new ArrayList<>();
        List<List<Integer>> list2=new ArrayList<>();
        fun(0,list1,list2,nums,target,sum);
        return list2;
    }
    public static void fun(int i,List<Integer> list1,List<List<Integer>> list2,int[] arr,int target,int sum){
        if(i>=arr.length || sum>target){
            return;
        }
        if(sum==target){
            list2.add(new ArrayList<> (list1));
            return;
            }
        list1.add(arr[i]);
        fun(i,list1,list2,arr,target,sum+arr[i]);
        list1.remove(list1.size()-1);
        fun(i+1,list1,list2,arr,target,sum);
    }
}
