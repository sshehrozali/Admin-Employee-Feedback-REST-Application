package Employee;

import Admin.Data;
import Admin.Performance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    // All Employee Services
    // Make some Employee Data
    private List<Admin.Data> allData = new ArrayList<>(
            Arrays.asList(
                    new Admin.Data(1, "Hasan", true),
                    new Admin.Data(2, "Sheikh", true),
                    new Data(3, "Sara", true)
            )
    );

    // Make some Performance Data
    private List<Admin.Performance> allPerformances = new ArrayList<>(
            Arrays.asList(
                    new Admin.Performance(1, ""),
                    new Admin.Performance(2, ""),
                    new Performance(3, "")
            )
    );


}
