class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && map.get(s.charAt(i))==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }

        }
        return st.isEmpty();
    }
}
