class Solution {
    public String longestCommonPrefix(String[] strs) {

        //getting the shortest string; 
        int shrt = strs[0].length();
        for(String x : strs){
            if (x.length() < shrt) shrt = x.length();
        }

        String ans = new String();
        for(int i = 0; i<shrt; i++)
        {
            //char tmpChar = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[0].charAt(i) != strs[j].charAt(i)) return ans;
            }
            ans += strs[0].charAt(i);
        }
        return ans;
    }
}