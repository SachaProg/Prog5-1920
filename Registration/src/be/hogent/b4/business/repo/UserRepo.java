package be.hogent.b4.business.repo;

import be.hogent.b4.business.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> users;

    public UserRepo(){
        users = new ArrayList<>();
    }

    public void saveUser(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
