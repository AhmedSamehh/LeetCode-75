class Solution {
    public String reverseWords(String s) {
        String[] l = s.split(\\\\\s+\);
        StringBuilder sb = new StringBuilder();
        for(int i=l.length-1; i>=0; i--){
            sb.append(l[i]);
            sb.append(\ \);
        }
        return sb.toString().trim();
    }
}