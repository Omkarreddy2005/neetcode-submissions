class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        // FIX 1: Sort candidates so duplicate values sit next to each other
        Arrays.sort(candidates);
        
        rec(ans, list, 0, candidates, target, 0);
        return ans;
    }

    public void rec(List<List<Integer>> ans, List<Integer> list, int i, int[] nums, int target, int sum) {
        if (sum > target) return;
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            
            // FIX 2: Use loop variable 'j', NOT the fixed parameter 'i'
            list.add(nums[j]);
            
            // FIX 3: Move next call to 'j + 1' to avoid reusing the same element instance
            rec(ans, list, j + 1, nums, target, sum + nums[j]);
            
            list.remove(list.size() - 1);
        }
    }
}
