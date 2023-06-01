package UseCase.Auth.Login;

import Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginCtrl {
    @GetMapping("login")
    public String login() {
        LoginFlow flow = new LoginFlow(new UserService());
        String response = flow.login();
        return response;
    }
}
