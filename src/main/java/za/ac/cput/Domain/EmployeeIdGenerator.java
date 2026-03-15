package za.ac.cput.Domain;

public class EmployeeIdGenerator {

    private static EmployeeIdGenerator instance;
    private int currentId;

    private EmployeeIdGenerator (int currentId) {
        this.currentId = currentId;
    }

    public static EmployeeIdGenerator getInstance() {
        if (instance == null) {
            instance = new EmployeeIdGenerator (1000);
        }

        return instance;
    }

    public int generateId() {
        return ++ currentId;
    }
}
