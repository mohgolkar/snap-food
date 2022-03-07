package com.mapsa.SnapFood2.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }
    @PutMapping(value = "/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping(value = "getById/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
    @GetMapping(value = "getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
