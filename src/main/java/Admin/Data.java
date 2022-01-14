package Admin;

public class Data {

    Integer EmployeeID;
    String EmployeeName;
    String EmployeeReview;

    // Empty Constructor
    public Data() {
    }

    // Parameters Constructor
    public Data(Integer employeeID, String employeeName, String employeeReview) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        EmployeeReview = employeeReview;
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

    public String getEmployeeReview() {
        return EmployeeReview;
    }

    public void setEmployeeReview(String employeeReview) {
        EmployeeReview = employeeReview;
    }
}
