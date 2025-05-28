class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length -1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(i>=0||k>0) {
            if (i>=0){
            k = k+ num[i];
            i--;
            }
            ans.add(0, k%10);
            k/=10;
        }
        
        return ans;
    }
}