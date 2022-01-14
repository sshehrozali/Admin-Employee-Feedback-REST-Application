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
                new Data(1, "Hasan", "He is very Good!"),
                new Data(2, "Sheikh", "He is very Brilliant!"),
                new Data(3, "Urwa", "She is very Gorgeous!")
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
