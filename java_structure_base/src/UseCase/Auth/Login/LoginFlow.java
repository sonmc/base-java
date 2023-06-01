package UseCase.Auth.Login;

import Interface.IUser;
public class LoginFlow {
    IUser userService;
    public LoginFlow(IUser _userService){
        userService = _userService;
    }

    public String login(){
        String response = userService.get();
        return response;
    }
}
