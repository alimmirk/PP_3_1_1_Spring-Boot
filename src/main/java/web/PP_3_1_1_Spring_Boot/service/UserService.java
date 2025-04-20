package web.PP_3_1_1_Spring_Boot.service;

import jakarta.validation.Valid;
import web.PP_3_1_1_Spring_Boot.model.User;

import java.util.List;

public interface UserService {
    void save(@Valid User user);

    User findById(Long id);

    void removeUserById(long id);

    void updateUser(User user);

    List<User> findAll();
}
