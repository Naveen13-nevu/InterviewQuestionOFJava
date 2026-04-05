import java.util.Stack;

public class NextGreaterElement {


    public static int []nextGreat(int []arr){

        int n= arr.length;
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }


        return result;
    }

    public static void main(String[] args) {
        
        int []arr = {4, 3, 2, 1};

        int result[] = nextGreat(arr);

        for(int n : result){
            System.out.print(n+"->");
        }
    }
}
