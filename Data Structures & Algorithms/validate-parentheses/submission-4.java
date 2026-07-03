class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                if(!st.isEmpty() && st.peek()==map.get(ch)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
