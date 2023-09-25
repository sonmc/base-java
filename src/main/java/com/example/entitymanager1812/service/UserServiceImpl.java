package com.example.entitymanager1812.service;

import com.example.entitymanager1812.model.User;
import com.example.entitymanager1812.repository.impl.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return ((List<User>) userRepository.findAll());
    }
}
