class Solution {
    public int[] countBits(int n) {
        int []nums=new int[n+1];
        for(int i=0;i<=n;i++){
            int res=0,temp=i;
            while(temp!=0){
                res++;
                temp=temp&(temp-1);
            }
            nums[i]=res;
        }
        return nums;
    }
}
