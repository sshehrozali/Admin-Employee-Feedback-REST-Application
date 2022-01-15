package Employee;

public class Data {

    Integer EmployeeID;
    String EmployeeName;
    boolean EmployeeParticipation;

    // Empty Constructor
    public Data() {
    }

    // Parameters Constructor
    public Data(Integer employeeID, String employeeName, boolean employeeParticipation) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        EmployeeParticipation = employeeParticipation;
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

    public boolean isEmployeeParticipation() {
        return EmployeeParticipation;
    }

    public void setEmployeeParticipation(boolean employeeParticipation) {
        EmployeeParticipation = employeeParticipation;
    }
}
