import java.util.Stack;

public class ValidParanthese {

    public static boolean isValid(String s){


        Stack<Character> stack = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch == '}' && top != '{'){
                    return false;
                }
                else if (ch == ']' && top != '[') {
                    return false;
                }
                else if(ch == '(' && ch == ')'){
                    return false;
                }
            }

        }


        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        
        String str1 = "{}";
        String str2 = "{]";

        boolean result1  = isValid(str1);
        boolean result2  = isValid(str2);

        System.out.println("result 1: " + result1);
        System.out.println("result 2 : " + result2);


    }
}
