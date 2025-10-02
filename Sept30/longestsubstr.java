class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* int max=0;
        for(int i=0;i<s.length();i++){
            //ArrayList<Character> res=new ArrayList<Character>();
            Set<Character> res=new HashSet<Character>();
            for(int j=i;j<s.length();j++){
                if(!res.contains(s.charAt(j))){
                    res.add(s.charAt(j));
                    max=Math.max(max,res.size());

                }
                else{
                    break;
                }
            }
        }
        return max; */
        int st=0, e=0;
        int ans=0;
        int f[]=new int[256];
        int n=s.length();
        while(e<n){
            char ch=s.charAt(e);
            f[ch]++;
            e++;
            while(st<e&&f[ch]>1){
                char c2=s.charAt(st);
                f[c2]--;
                st++;
            }
            ans=Math.max(ans,e-st);
        }
        return ans;
    }
}