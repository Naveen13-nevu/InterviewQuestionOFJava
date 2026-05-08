import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    public String name;
    public double salary;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
}

public class SortBySalary {
    
    public static void main(String[] args) {
        
        List<Employee> list = Arrays.asList(

            new Employee("Naveen", 20000),
            new Employee("Praveen", 10000),
            new Employee("Arun", 30000)

        );

        List<Employee> sorting = list.stream()
        .sorted(Comparator.comparingDouble(e-> e.salary))
        .collect(Collectors.toList());

        sorting.forEach(e-> System.out.println(e.name+ "-"+ e.salary));

    }
}
