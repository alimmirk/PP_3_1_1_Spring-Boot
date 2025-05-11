package web.PP_3_1_1_Spring_Boot.dao;

import jakarta.validation.Valid;
import web.PP_3_1_1_Spring_Boot.model.User;

import java.util.List;

public interface UserDao {

    void save(@Valid User user);

    User findById(Long id);

    void removeUserById(long id);

    void updateUser(User user);

    List<User> findAll();
}
