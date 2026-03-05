
import java.util.HashSet;


public class FindDuplicates {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,5,3};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate is "+ arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}