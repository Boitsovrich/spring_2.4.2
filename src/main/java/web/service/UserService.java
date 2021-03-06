package web.service;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserByName(String login);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);


}
