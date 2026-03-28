import java.util.HashSet;

public class FindDuplicates {

    public static void duplicates(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                duplicates.add(num);
            }
            else{
                set.add(num);   
            }
        }
        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,6};
        duplicates(arr);

    }
}
