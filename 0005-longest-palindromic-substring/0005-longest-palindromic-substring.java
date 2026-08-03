class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<= 1){
            return s;
        }

        String maxStr = s.substring(0,1);

        for(int i = 0; i < s.length(); i++){
            String odd = fn(s,i,i);
            String even = fn(s, i, i+1);

            if(odd.length()> maxStr.length()){
                maxStr = odd;
            }
            if(even.length()> maxStr.length()){
                maxStr = even;
            }
            
        }
        
        return maxStr;
    
    }
    public String fn (String str, int left, int right){
            while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }
            return str.substring(left+1, right);
        }
}