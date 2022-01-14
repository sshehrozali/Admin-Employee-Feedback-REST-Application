// Admin Service
package Admin;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AdminService {

    // Make some Employee Data
    private List<Data> allData = new ArrayList<> (
        Arrays.asList(
                new Data(1, "Hasan"),
                new Data(2, "Sheikh")
        )
    );

    // Make some Performance Data
    private List<Performance> allPerformances = new ArrayList<>(
            Arrays.asList(
                    new Performance(1, ""),
                    new Performance(2, "")
            )
    );

    // ALL GET METHODS //
    // All Employee Data
    public List<Data> viewAllData() {
        return allData;
    }
    // Specific Employee Data
    public Data viewSpecificData(Integer id) {
        return allData.stream().filter(d -> d.getEmployeeID().equals(id)).findFirst().get();
    }
    // Show All Performances
    public List<Performance> showAllPerformances() {
        return allPerformances;
    }

    // ALL POST METHODS //
    // Creates a new Employee
    public void createEmployee(Data data) {
        allData.add(data);
    }
    // Sets New Performance for the Employee
    public void addEmployeePerformance(Integer id, Performance performance) {
        for (int i = 0; i < allPerformances.size(); i++) {
            if(allPerformances.get(i).getID().equals(id)) {
                allPerformances.set(i, performance);
                System.out.println("Employee Performance Set");
            }
        }
    }


    // ALL PUT METHODS //
    public void updateEmployee(Integer id, Data data) {
        for (int i = 0; i < allData.size(); i++) {
            Data d = allData.get(i);    // Get single Object from Array
            if(d.getEmployeeID().equals(id)) {
                allData.set(i, data);   // Replace Old Data with new Data (which client has passed)
                System.out.println("Employee Updated");
            }
        }
    }
    public void updateEmployeePerformance(Integer id, Performance performance) {
        addEmployeePerformance(id, performance);    // Use the same above function to update Employee's Performance (Re-Usability)
    }

    // ALL DELETE METHODS //
    public void deleteEmployee(Integer id) {
        allData.removeIf(d -> d.getEmployeeID().equals(id));    // Delete Employee Data (If id is found)
        System.out.println("Employee Deleted");
    }
}
