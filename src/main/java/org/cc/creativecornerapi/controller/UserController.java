package org.cc.creativecornerapi.controller;

import org.cc.creativecornerapi.entity.User;
import org.cc.creativecornerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addUser(@RequestBody String username, @RequestBody String password, @RequestBody String uType) {
        User user = new User();
        user.setUserId(1001);
        user.setUsername(username);
        user.setPassword(password);
        user.setuType(uType);
        return "Saved";
    }

}
