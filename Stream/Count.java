import java.util.*;

public class Count {
    
    public static void main(String[] args) {
        
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14,15);

        long count = list.stream()
        .filter(e-> e>10)
        .count();

        System.out.println(count);

    }
}
