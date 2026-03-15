package za.ac.cput.Domain;

public class Employee {

    private final String employeeId;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static class Builder {
        public String employeeId;
        private String customerID;
        private String firstName;
        private String lastName;
        public String emailAddress;

        public Builder setCustomerId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId= '" + employeeId + '\''
                + ", firstName= '" + firstName + '\'' + ", lastName= '" + lastName + '\'' +
                ", emailAddress= '" + emailAddress + '\'' + '}';
    }
}

