
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutives {

    public static int longest(int arr[]){

        Set<Integer> set  = new HashSet<>();
        int maxLength =0;

        for(int num : arr){
            set.add(num);
        }


        for(int num : set){

            if(!set.contains(num-1)){
                int current = num;
                int length=1;

                while(set.contains(current +1)){
                    current++;
                    length++;
                }
                if(length>maxLength){
                    maxLength = length;
                }
            }
        }


        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {100,1,200,2,3,4,5,400};

        int result = longest(arr);
        System.out.println(result);


    }
}
