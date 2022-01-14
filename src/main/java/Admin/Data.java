package Admin;

public class Data {

    Integer EmployeeID;
    String EmployeeName;

    // Empty Constructor
    public Data() {
    }

    // Parameters Constructor
    public Data(Integer employeeID, String employeeName) {
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
