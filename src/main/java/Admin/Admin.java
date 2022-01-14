// Admin Entity
package Admin;

public class Admin {

    Integer EmployeeID;
    String EmployeeName;

    // Empty Constructor
    public Admin() {
    }

    // Parameters Constructor
    public Admin(Integer employeeID, String employeeName) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
    }

    // Getters & Setters
    public Integer getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
}
