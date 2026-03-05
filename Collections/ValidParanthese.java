import java.util.Stack;

public class ValidParanthese {
    public static boolean isValid(String str){

       Stack<Character> stack = new Stack<>();
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return  false;
            }
            char top = stack.pop();
            if(ch==')' && top != '('){
                return false;
            }
            if(ch=='}' && top != '{'){
                return false;
            }
            
            if(ch==']' && top != '['){
                return false;
            }
        }
       }

        return stack.isEmpty();

    }
    public static void main(String[] args) {
       
        System.out.println(isValid("()"));
        System.out.println(isValid("{])"));


    }
}
