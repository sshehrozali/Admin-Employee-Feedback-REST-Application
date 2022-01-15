package Employee;

// Import Database Packages -> Classes
import Database.Data;
import Database.Performance;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    // Make some Employee Data
    private List<Data> allData = new ArrayList<> (
            Arrays.asList(
                    new Data(1, "Hasan", true, ""),
                    new Data(2, "Sheikh", true, ""),
                    new Data(3, "Sara", true, "")
            )
    );

    // Make some Performance Data
    private List<Performance> allPerformances = new ArrayList<>(
            Arrays.asList(
                    new Performance(1, ""),
                    new Performance(2, ""),
                    new Performance(3, "")
            )
    );

    // Empty Performance Data (If Employee Credentials FAILED to match in Database)
    private List<Performance> emptyPerformances = new ArrayList<>(
            Arrays.asList(
                    new Performance(0, "")
            )
    );

    // Display All Employee Performances
    public List<Performance> displayEmployeesPerformances(Integer id) {
        for (int i = 0; i < allData.size(); i++) {
            if(allData.get(i).getEmployeeID().equals(id)) {
                boolean check = allData.get(i).isEmployeeParticipation();
                if(check) {
                    return allPerformances;     // If ID is present & GRANTED ACCESS to participate (by Admin) -> Then return all performances
                }
            }
        }
        System.out.println("Wrong Credentials Provided. Your Employee ID Not Found.");
        return emptyPerformances;
    }
}
