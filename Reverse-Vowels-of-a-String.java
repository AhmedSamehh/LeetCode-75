class Solution {
    public String reverseVowels(String s) {
       Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        Stack<Character> strStack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))){
                System.out.println(s.charAt(i));
                strStack.push(s.charAt(i));
            }
        }
        StringBuilder outStr = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))){
                outStr.append(strStack.pop());
            }
            else {
                outStr.append(s.charAt(i));
            }
        }
        return outStr.toString();
    }
}