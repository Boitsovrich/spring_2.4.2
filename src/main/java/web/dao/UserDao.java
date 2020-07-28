package web.dao;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserDao{

    List<User> getAllUsers();

    User getUserByName(String login);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUserById(Long id);

}
