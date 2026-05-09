import java.util.*;

public class FindMax {
   
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Optional<Integer> max = list.stream()
        .max(Integer:: compareTo);

        System.out.println(max.orElse(0));

    }
}
