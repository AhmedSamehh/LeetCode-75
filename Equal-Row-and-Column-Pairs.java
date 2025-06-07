class Solution {
    public int equalPairs(int[][] grid) {
        List<String> cols = new ArrayList<String>();
        List<String> rows = new ArrayList<String>();
        for(int i=0; i<grid.length; i++) {
            String c = "";
            String r = "";
            for(int j=0; j<grid[i].length; j++) {
                r+=grid[i][j] + "-";
                c+=grid[j][i] + "-";
            }
            cols.add(c);
            rows.add(r);
        }
        
        int cnt=0;
        for(int m=0; m<grid.length; m++) {
            for(int n=0; n<grid.length; n++) {
                if(cols.get(m).equals(rows.get(n)))
                    cnt++;
            }
        }
        
        return cnt;
    }
}