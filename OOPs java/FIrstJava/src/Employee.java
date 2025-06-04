import java.util.*;
public class Employee {
    String name,add;
    int emp_id;
    double new_sal;

    public void Emp_details() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        name = ob.nextLine();
        System.out.println("Enter Employee ID:");
        emp_id = ob.nextInt();
       System.out.println("Enter Employee Address:");
        add = ob.next();
    }

    public void Emp_salary() {
        Scanner ob = new Scanner(System.in);
        double sal;
        System.out.println("Enter Employee salary:");
        sal = ob.nextInt();
        double pf = sal * 0.04;
        double si = sal * 0.02;
        new_sal = sal - (pf + si);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + emp_id);
        System.out.println("Address: " + add);
        System.out.println("Net salary: " + new_sal);
    }
}
class Main_class {
    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.Emp_details();
        ob.Emp_salary();
        ob.display();
    }
}

