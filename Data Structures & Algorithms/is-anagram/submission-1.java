class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        
        int[] sMap = new int[28];
        int[] tMap = new int[28];

        for(int i= 0; i<s.length(); i++){
            sMap[sChar[i] - 97]++;
            tMap[tChar[i] - 97]++;
        } 

        return Arrays.equals(sMap, tMap);
    
    }
}
