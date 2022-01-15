// Admin Controller
package Admin;

// Import Database Packages -> Classes
import Database.Data;
import Database.Performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AdminController {

    // Dependency Injection
    @Autowired
    private AdminService adminService;

    @RequestMapping("/test")
    public String test() {
        return "Hello, I am a Spring Boot based Web App!";
    }

    // GET (All Employee Data)
    @RequestMapping("api/admin/employee/all")
    public List<Data> viewAll() {
        return adminService.viewAllData();
    }

    // GET (Specific Employee Data)
    @RequestMapping("api/admin/employee/view/{id}")
    public Data viewSpecific(@PathVariable Integer id) {
        return adminService.viewSpecificData(id);
    }

    // POST (Create New Employee Data)
    @RequestMapping(method = RequestMethod.POST, value = "api/admin/employee/create")
    public void create(@RequestBody Data data) {
        adminService.createEmployee(data);
    }

    // PUT (Update Employee Data)
    @RequestMapping(method = RequestMethod.PUT, value = "api/admin/employee/update/{id}")
    public void update(@RequestBody Data data, @PathVariable Integer id) {
        adminService.updateEmployee(id, data);
    }

    // DELETE (Delete Employee Data)
    @RequestMapping(method = RequestMethod.DELETE, value = "api/admin/employee/delete/{id}")
    public void delete(@PathVariable Integer id) {
        adminService.deleteEmployee(id);
    }

    // GET (Show All Employees Performances with their IDs -> Primary Key)
    @RequestMapping("api/admin/performance/all")
    public List<Performance> performances() {
        return adminService.showAllPerformances();
    }

    // POST (Set Performance of the Employee by ID -> Primary Key)
    @RequestMapping(method = RequestMethod.POST, value = "api/admin/performance/add/{id}")
    public void addPerformance(@RequestBody Performance performance, @PathVariable Integer id) {
        adminService.addEmployeePerformance(id, performance);
    }

    // PUT (Update Performance of the Employee by ID -> Primary Key)
    @RequestMapping(method = RequestMethod.PUT, value = "api/admin/performance/update/{id}")
    public void updatePerformance(@RequestBody Performance performance, @PathVariable Integer id) {
        adminService.updateEmployeePerformance(id, performance);
    }
}
