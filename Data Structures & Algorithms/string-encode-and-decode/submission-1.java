class Solution {
        String s="";
    List<Integer> li=new ArrayList<>();
    public String encode(List<String> strs) {
        s="";
        li.clear();
        if(strs.isEmpty()){
            return s;
        }
        for(int i=0;i<strs.size();i++){
            s+=strs.get(i);
            li.add(strs.get(i).length());
        }
        return s;
    }

    public List<String> decode(String str) {
        int n=str.length();
        List<String> l=new ArrayList<>();
        if(li.isEmpty()) return l;
        int i=0,j=0;
        while(i<n || j<li.size()){
            l.add(str.substring(i+0,i+li.get(j)));
            i+=li.get(j);
            j++;
        }
        return l;
    }
}
