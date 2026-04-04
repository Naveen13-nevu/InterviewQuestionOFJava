
import java.util.HashMap;

public class countFrequencyUsingHashMap {

    public static void count(int []arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n: arr){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }

        }
        System.out.print(map+" ");
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,4,4,4,5};
        count(arr);
    }
}
