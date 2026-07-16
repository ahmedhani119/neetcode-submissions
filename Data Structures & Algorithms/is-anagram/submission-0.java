class Solution {
    public boolean isAnagram(String s, String t) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);

        System.out.println(sChars);
        System.out.println(tChars);
    
        return Arrays.equals(sChars, tChars);
    }
}
