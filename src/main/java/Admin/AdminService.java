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

    // READ
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

    // CREATE
    public void createEmployee(Data data) {
        allData.add(data);
    }
    // UPDATE
    public void updateEmployee(Integer id, Data data) {
        for (int i = 0; i < allData.size(); i++) {
            Data d = allData.get(i);    // Get single Object from Array
            if(d.getEmployeeID().equals(id)) {
                allData.set(i, data);   // Replace Old Data with new Data (which client has passed)
                System.out.println("Employee Updated");
            }
        }
    }
    // DELETE
    public void deleteEmployee(Integer id) {
        allData.removeIf(d -> d.getEmployeeID().equals(id));    // Delete Employee Data (If id is found)
        System.out.println("Employee Deleted");
    }
}
