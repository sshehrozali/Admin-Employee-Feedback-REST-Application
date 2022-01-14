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
    // UPDATE
    // DELETE
}
