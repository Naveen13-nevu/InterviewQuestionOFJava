import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int result [] = new int[n];

        for(int i=n-1; i>=0;i--){

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

        int[] arr = {4, 5, 2, 25};

        int[] res = nextGreater(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}