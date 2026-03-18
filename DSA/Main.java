import java.util.Scanner;

class Employee{
    int id;
    String name;
    double salary;

    void display(){
        System.out.println(id+" "+ name+" "+ salary);
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee [] emp = new Employee[5];
        for(int i=0;i<5;i++){
            emp[i] = new Employee();

            System.out.println("Enter the details for Employee "+(i+1));
            System.out.println("Enter the id: ");
            emp[i].id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name: ");
            emp[i].name = sc.nextLine();

            System.out.println("Enter the salary: ");
            emp[i].salary = sc.nextDouble();
        }

        for(int i=0;i<5;i++){
            emp[i].display();
        }

    }
}