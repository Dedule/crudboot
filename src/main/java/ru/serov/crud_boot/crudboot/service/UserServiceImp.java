package ru.serov.crud_boot.crudboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.serov.crud_boot.crudboot.dao.UserDAO;
import ru.serov.crud_boot.crudboot.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public List<User> getUserList() {
        return userDAO.index();
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public User show(Long id) {
        return userDAO.show(id);
    }

    @Transactional
    @Override
    public void update(Long id, User updUser) {
        userDAO.update(id, updUser);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
