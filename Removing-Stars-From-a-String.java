class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '*'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        List<Character> list = new ArrayList<>(stack);
        String result = list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
        return result;
    }
}