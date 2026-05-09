import java.util.*;

public class FirstElementGreaterThanFive {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Optional<Integer> findFirst = list.stream()
        .filter(n -> n>5)
        .findFirst(); 

        System.out.println(findFirst);

    }
}
