package hash;

public class StoredEmployee {
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.employee = employee;
        this.key = key;
    }
}
