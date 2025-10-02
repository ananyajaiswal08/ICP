class Solution {
    public int characterReplacement(String s, int k) {
        /* int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            int max=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'A']++;
                max=Math.max(max,freq[ch-'A']);
                if((j-i+1)-max>k) break;
                ans=Math.max(ans,j-i+1);
            }
            

        }
        return ans; */
        int st=0;
        int end=0;
        int max=0;
        int ans=0;
        int fr[]=new int[26];
        while(end<s.length()){
            char ch=s.charAt(end);
            fr[ch-'A']++;
            max=Math.max(max,fr[ch-'A']);
            while((end-st+1)-max>k){
                fr[s.charAt(st)-'A']--;
                st++;
            }
            ans=Math.max(ans,end-st+1);
            end++;

        }
        return ans;
    }
}