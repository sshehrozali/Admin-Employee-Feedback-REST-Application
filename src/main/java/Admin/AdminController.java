// Admin Controller
package Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    // PUT (Update Employee Data)
    // DELETE (Delete Employee Data)
}
