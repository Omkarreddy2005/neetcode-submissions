class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
            if(!st.isEmpty() && map.get(s.charAt(i))==st.peek()){
                st.pop();
            }
            else{
                return false;
            }
            }
            else{
                st.push(s.charAt(i));
            }

        }
        return st.isEmpty();
    }
}
