package jpa.project.mignone.service;

import jpa.project.mignone.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("jack", "ADMIN");
        userRepository.save(user);
        Optional<User> userId1 = userRepository.findById(user.getId());
        log.info("New user is created" + userId1);

        List<User> users = userRepository.findAll();
        log.info("All users: " + users);
    }
}
