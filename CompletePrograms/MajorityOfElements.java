import java.util.HashMap;

public class MajorityOfElements {

    public static int major(int []nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);

            if(map.get(num)>nums.length/2){
                return  num;
            }
        }


        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {2,2,1,1,3,3,2,2,2};
        int result = major(arr);
        System.out.println(result);

    }
}
