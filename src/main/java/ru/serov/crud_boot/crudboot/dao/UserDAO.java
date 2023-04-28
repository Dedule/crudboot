package ru.serov.crud_boot.crudboot.dao;


import ru.serov.crud_boot.crudboot.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();

    User show(Long id);

    void save(User user);

    void update(Long id, User updUser);

    void delete(Long id);
}
