class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            System.out.println("not =");
            return "";
        }
        
        if(isBigger(str1,str2)){
            System.out.println("str1 bigger");
            return str1.substring(0,gcdLen(str1.length(), str2.length()));
        }
        System.out.println("str2 bigger");
        return str2.substring(0,gcdLen(str2.length(), str1.length()));
    }

    //return true if first param is bigger
    boolean isBigger(String s1, String s2) {
        return s1.length() > s2.length();
    }
    int gcdLen(int len1, int len2) {
        while(len2 != 0) {
            int tmp = len2;
            len2 = len1 % len2;
            len1 = tmp;
        }
        return len1;
    }
}