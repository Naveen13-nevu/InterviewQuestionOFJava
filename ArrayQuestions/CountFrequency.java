
import java.util.HashMap;

public class CountFrequency {

    public static void countFreq(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5,5,5,5};
        countFreq(arr);
    }
}
