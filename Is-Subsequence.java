class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=0;
        int lastJ=-1;
        for(int i=0; i< s.length(); i++) {
            for(int j=0; j< t.length(); j++) {
                if(s.charAt(i) == t.charAt(j) && j>lastJ) {
                    x++;
                    lastJ=j;
                    break;
                }
            }
        }
        return x == s.length();
    }
}