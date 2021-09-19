package jpa.project.mignone.service;

import jpa.project.mignone.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.*;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    private UserService userService;

    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("jack", "ADMIN");
        long insert = userService.insertUser(user);
        log.info("New user is created" + user);
    }
}
