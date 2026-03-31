import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    public static int [] maxSlidingWindow(int nums[], int k){

        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int result[] = new int[n - k+1];
        int index =0;

        for(int i=0;i<n;i++){

            if(!dq.isEmpty() && dq.peek() == i-k){
                dq.poll();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offer(i);

             if(i >= k-1){
                result[index] = nums[dq.peek()];
                index++;
             }

        }
        return result;
    }


    public static void main(String[] args) {
        
          int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        for(int n : res){
            System.out.print(n+" ");
        }

    }
}
