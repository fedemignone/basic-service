package rest.service.mignone.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rest.service.mignone.user.service.UserServiceImpl;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserServiceImpl userService;

    // retrieveAllUsers
    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return userService.findAll();
    }

    // retrieveUser(int id)
    @GetMapping(path = "/users/{id}")
    public User retrieveUserById(@PathVariable Integer id){
        return userService.findOne(id);
    }
}
