class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int n=s.length();
        int len=0;
        int l=0,max=0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;
            max=Math.max(max,freq[s.charAt(i)-'A']);
            while((i-l+1-max)>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            len=Math.max(len,(i-l)+1);
        }
        return len;
    }
}
