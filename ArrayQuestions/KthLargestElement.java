
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int KthElement(int arr[], int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr){

            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int k = 3;
        int res = KthElement(arr,k);
        System.out.println(res);
    }
}
