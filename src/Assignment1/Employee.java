package Assignment1;

public class Employee {
   String EmployeeId;
    String name;
   static String designation;

    public Employee(String employeeId, String name) {
        EmployeeId = employeeId;
        this.name = name;
    }
    public Employee() {
        EmployeeId ="";
        this.name = "";
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDesignation() {
        return designation;
    }

    public static void setDesignation(String designation) {
        Employee.designation = designation;
    }
}
