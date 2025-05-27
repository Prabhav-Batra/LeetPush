class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] alp = alphabets.toCharArray();
        int count = 0;
        for(int i = 0; i < alp.length; i++){
            if(sentence.indexOf(alp[i]) != -1){
                continue;
            }
            else{
                return false;

            }
            
        }
        return true;
    }
}