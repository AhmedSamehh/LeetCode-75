class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer> x = new ArrayList<>();
        x.add(0);
        for (int num : gain) {
            x.add(num);
        }
        for(int i=1; i<x.size(); i++) {
            x.set(i, x.get(i-1)+x.get(i));
        }

        return Collections.max(x);
    }
}