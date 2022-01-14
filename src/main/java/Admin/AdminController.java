// Admin Controller
package Admin;

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
    @RequestMapping("/admin/employee/all")
    public List<Data> viewAll() {
        return adminService.viewAllData();
    }

    // GET (Specific Employee Data)
    @RequestMapping("/admin/employee/view/{id}")
    public Data viewSpecific(@PathVariable Integer id) {
        return adminService.viewSpecificData(id);
    }

    // POST (Create New Employee Data)
    @RequestMapping(method = RequestMethod.POST, value = "/admin/employee/create")
    public void create(@RequestBody Data data) {
        adminService.createEmployee(data);
    }

    // PUT (Update Employee Data)
    @RequestMapping(method = RequestMethod.PUT, value = "/admin/employee/update/{id}")
    public void update(@RequestBody Data data, @PathVariable Integer id) {
        adminService.updateEmployee(id, data);
    }

    // DELETE (Delete Employee Data)
    @RequestMapping(method = RequestMethod.DELETE, value = "/admin/employee/delete/{id}")
    public void delete(@PathVariable Integer id) {
        adminService.deleteEmployee(id);
    }

    // GET (Show All Employees Performances with their IDs -> Primary Key)
    @RequestMapping("/admin/performance/all")
    public List<Performance> performances() {
        return adminService.showAllPerformances();
    }


}
