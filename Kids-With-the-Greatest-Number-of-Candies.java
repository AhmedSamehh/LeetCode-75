class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt(); 
        List<Boolean> out = new ArrayList<>();
        for(int i=0;i<candies.length;i++) {
            if(candies[i] + extraCandies < max) {
                out.add(false);
                continue;
            }
            out.add(true);
        }
        return out;
    }
}