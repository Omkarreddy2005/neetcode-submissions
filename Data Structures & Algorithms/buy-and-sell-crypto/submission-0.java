class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max1=0;
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,prices[j]);
            }
            max1=Math.max(max1,max-prices[i]);
        }
        return max1;
    }
}
