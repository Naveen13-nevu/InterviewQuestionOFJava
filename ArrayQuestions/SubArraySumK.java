
import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumK {

    public static int subArray(int arr[], int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        int count =0;
        map.put(0, 1);

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];

            if(map.containsKey(sum-k)){
                count = count+ map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();

    System.out.println("Enter the array element: ");
    int arr[] = new int[size];

    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter the k element: ");
    int k = sc.nextInt();

    int result = subArray(arr,k);
    System.out.println("result: "+ result);


    }
}
