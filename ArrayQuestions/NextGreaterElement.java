import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Assign result
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
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