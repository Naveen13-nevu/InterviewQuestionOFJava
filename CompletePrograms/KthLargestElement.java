
import java.util.PriorityQueue;

public class KthLargestElement {

public static int largest(int arr[], int key){

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int num : arr){
        pq.offer(num);

        if(pq.size()>key)
    {
    pq.poll();
    }  
  }
    return pq.peek();
}


    public static void main(String[] args) {
        int arr[] = {10,30,20,40};
        int k = 2;
        int result = largest(arr, k);
        System.out.println(result);
    }
}
