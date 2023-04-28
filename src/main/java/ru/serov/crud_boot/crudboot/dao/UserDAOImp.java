package ru.serov.crud_boot.crudboot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import ru.serov.crud_boot.crudboot.models.User;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO{

    @PersistenceContext
    private EntityManager sf;



    public List<User> index() {
        return sf.getCurrentSession()
                .createQuery("select user from User user", User.class).getResultList();
    }

    public User show(Long id) {
        return sf.getCurrentSession().get(User.class, id);
    }

    public void save(User user) {
        sf.getCurrentSession().save(user);
    }

    public void update(Long id, User updUser) {
        Session s = sf.getCurrentSession();
        User user = s.get(User.class, id);
        user.setName(updUser.getName());
        user.setAge(updUser.getAge());
    }

    public void delete(Long id) {
        Session s = sf.getCurrentSession();
        User user = s.get(User.class, id);
        s.remove(user);
    }
}
