class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ']')
                stack.push(s.charAt(i));
            else{
                String str = \\;
                while(stack.peek() != '[') {
                    str = stack.pop() + str;
                }
                stack.pop();
                String num = \\;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num = stack.pop() + num;    
                }                        
                int count = 1;
                if (num.length() > 0) {
                    count = Integer.parseInt(num);
                }
                    
                for(int j = 0; j < count; j++) {
                    for (char c : str.toCharArray()) {
                        stack.push(c);
                    }
                }
            }
        }
        StringBuilder finalResult = new StringBuilder();
        while(!stack.isEmpty()) {
            finalResult.insert(0, stack.pop()); 
        }
        return finalResult.toString();
    }
}