class Solution {
    public int maximumLengthSubstring(String s) {
        int freq [] = new int [26];

        int left =0;
        int ans =0;

        for(int right =0;right<s.length();right++){

            int c = s.charAt(right) -'a';
            freq[c]++;

            while(freq[c]>2){
                int leftchar = s.charAt(left)-'a';
                freq[leftchar]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);

        }
        return ans;
    }
}