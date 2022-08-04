package org.academiadecodigo.ferramisto.services;

import org.academiadecodigo.ferramisto.persistence.models.User;

import java.util.List;

public interface UserService {

    User get(Integer id);

    User save(User user);

    void delete(Integer id);

    List<User> list();

}
