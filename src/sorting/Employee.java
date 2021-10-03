package sorting;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lasteName;
    private int id;

    public Employee(String firstName, String lasteName, int id) {
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lasteName='" + lasteName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lasteName.equals(employee.lasteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lasteName, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
