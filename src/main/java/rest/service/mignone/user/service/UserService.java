package rest.service.mignone.user.service;

import rest.service.mignone.user.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findOne(int id);

    User deleteById(int id);
}
