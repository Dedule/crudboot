package ru.serov.crud_boot.crudboot.service;


import ru.serov.crud_boot.crudboot.models.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    void save(User user);

    User show(Long id);

    void update(Long id, User updUser);

    void delete(Long id);
}
