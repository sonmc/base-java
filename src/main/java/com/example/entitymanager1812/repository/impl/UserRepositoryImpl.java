package com.example.entitymanager1812.repository.impl;

import com.example.entitymanager1812.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery(String.format("select c from User c where c.name = '%s'", "dsadsad"),User.class);
        return query.getResultList();
    }


}
