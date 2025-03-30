class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int cnt = 1;
        if(chars.length>1) {
            for(int i=1; i<chars.length; i++) {
                if(chars[i] != chars[i-1]) {
                    if(cnt > 1)
                        sb.append(cnt);
                    sb.append(chars[i]);
                    cnt=1;
                    continue;
                }
                cnt++;
                
            }
            if(cnt > 1)
                sb.append(cnt);
        }
        for(int i =0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}