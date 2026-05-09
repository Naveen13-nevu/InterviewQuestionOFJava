import java.util.*;

public class SumUsingReduce {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        long sum = list.stream()
        .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
