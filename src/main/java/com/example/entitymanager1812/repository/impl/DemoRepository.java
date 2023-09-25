package com.example.entitymanager1812.repository.impl;

import com.example.entitymanager1812.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public interface DemoRepository<T> {
    List<T> findAll();
}
