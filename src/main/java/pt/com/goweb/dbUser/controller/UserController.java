package pt.com.goweb.dbUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.com.goweb.dbUser.model.User;
import pt.com.goweb.dbUser.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    private List<User> usuarios(){

        return userRepository.findAll();
    }

    @PostMapping User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
