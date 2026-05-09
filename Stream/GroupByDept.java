
import java.util.*;
import java.util.stream.Collectors;



class Employee{

public String name;
public String dept;
public double salary;

public Employee(String name, String dept,double salary){
    this.name = name;
    this.salary = salary;
    this.dept = dept;
}

public void setName(String name){
    this.name = name;
}
public void setDept(String dept){
    this.dept = dept;
}
public void setSalary(double salary){
    this.salary = salary;
}

public String getName(){
    return name;
}

public String getDept(){
    return dept;
}
public double getSal(){
    return salary;
}


public String toString(){
    return name+" - "+ salary+" - "+ dept;
}

}
public class GroupByDept {
    
    public static void main(String[] args) {
        
       List<Employee> list = Arrays.asList(

        new Employee("Naveen", "Hr", 10000),
        new Employee("praveen", "Hr", 10000),
        new Employee("Arun", "IT", 10000),
        new Employee("Arul", "IT", 10000),
        new Employee("Kevin", "Software", 10000)
       );

       Map<String,List<Employee>> sort = list.stream()
       .collect(Collectors.groupingBy(Employee::getDept));
       System.out.println(sort);

    }
}
