import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[5];

        // Input
        for (int i = 0; i < 5; i++) {
            emp[i] = new Employee();

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter ID: ");
            emp[i].id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            emp[i].name = sc.nextLine();

            System.out.print("Enter Salary: ");
            emp[i].salary = sc.nextDouble();
        }

        // Output
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }
    }
}