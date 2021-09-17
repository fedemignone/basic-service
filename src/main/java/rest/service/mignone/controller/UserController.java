package rest.service.mignone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rest.service.mignone.exception.UserNotFoundException;
import rest.service.mignone.user.User;
import rest.service.mignone.user.service.UserServiceImpl;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

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
        User user = userService.findOne(id);
        if (user == null){
            throw new UserNotFoundException("Couldn't find the user with the id: " + id);
        }
        return user;
    }

    //Create a User and return it
    @PostMapping(path = "/users")
    public ResponseEntity<Object> createUser(@RequestBody  User user){
        User savedUser = userService.save(user);

        // Devuelvo el user creado
        // /user/{id} -> savedUser.getId()
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}") // Le agegro algo al final del path, en este caso el id del user creado.
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public User deleteUser(@PathVariable int id){
        User user = userService.deleteById(id);

        if(user == null){
            throw new UserNotFoundException("id-" + id);
        }

        return null;
    }

}
