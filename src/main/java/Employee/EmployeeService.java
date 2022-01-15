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


}
