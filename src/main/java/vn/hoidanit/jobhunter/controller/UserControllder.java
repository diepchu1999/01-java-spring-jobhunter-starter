package vn.hoidanit.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;

@RestController
public class UserControllder {
    private final UserService userService;

    public UserControllder(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/create")
    public String createNewUser() {

        User user = new User();
        user.setEmail("hoidanit@gmail.com");
        user.setPassword("123456");
        user.setName("Eric");
        this.userService.handleCreateUser(user);
        return "create user";
    }
}
