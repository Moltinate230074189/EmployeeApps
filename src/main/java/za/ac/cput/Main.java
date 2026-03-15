package za.ac.cput;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Factory.EmployeeFactory;

public class Main {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.createEmployee("Molly", "More", "molly@email.com");

        if(employee != null) {
            System.out.println("Employee Registered Successfully!\n");
            System.out.println(employee);
        } else {
            System.out.println("Employee Registration Failed.");
        }
    }
}
