class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++) {
            if(words[i].contains(x+"")) {
                indices.add(i);
            }
        }
        return indices;
    }
}