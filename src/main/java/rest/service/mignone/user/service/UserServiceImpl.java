package rest.service.mignone.user.service;

import org.springframework.stereotype.Component;
import rest.service.mignone.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 4;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Federico", new Date()));
        users.add(new User(3, "Juan Carlos", new Date()));
        users.add(new User(4, "Adam2", new Date()));
    }

    // public List<User> findAll()
    @Override
    public List<User> findAll(){
        return users;
    }

    // public User save(User user)
    @Override
    public User save(User user){
        //if(user.getId() == null){
            user.setId(++usersCount);
        //}
        users.add(user);
        return user;
    }

    // public User findOne(int id)
    @Override
    public User findOne(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
