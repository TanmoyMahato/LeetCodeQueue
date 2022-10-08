class Solution {
    public String decodeString(String s) {
        String str = "";
        String num = "";
        
        Stack<String> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            //if(character is digit)
            if(Character.isDigit(s.charAt(i))){
                num += s.charAt(i);
            }
            
            //else if(char is '[')
            else if(s.charAt(i) == '['){
                stk.push(str);
                stk.push(num);
                str = "";
                num = "";
            }
            
            //else if(char is ']')
            else if(s.charAt(i) == ']'){
                int multiplystr = Integer.valueOf(stk.pop());
                str = stk.pop() + str.repeat(multiplystr);
            }
            
            //else (its character)
            else{
                str += s.charAt(i);
            }
        }
        
        return str;
    }
}