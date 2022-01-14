// Admin Controller
package Admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @RequestMapping("/test")
    public String test() {
        return "Hello, I am a Spring Boot based Web App!";
    }
}
