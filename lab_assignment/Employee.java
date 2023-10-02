package lab_assignment;

public class Employee {
    private String employeeID;
    private  String name;
    private String designation= "LAB ATTENDANT";

    public Employee(String employeeID, String name, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
