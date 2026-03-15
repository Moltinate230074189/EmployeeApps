package za.ac.cput.Factory;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Util.Email;
import java.util.UUID;

public class EmployeeFactory {

    public static Employee createEmployee(String firstName, String lastName, String emailAddress) {

        if(firstName == null || firstName.isEmpty())
            return null;
        if(lastName == null || lastName.isEmpty())
            return null;
        if(!Email.isValidEmail(emailAddress))
            return null;

        String customerId = UUID.randomUUID().toString();

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmailAddress(emailAddress)
                .build();
    }
}
