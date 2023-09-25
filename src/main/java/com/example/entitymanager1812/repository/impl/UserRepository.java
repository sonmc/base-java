package com.example.entitymanager1812.repository.impl;

import com.example.entitymanager1812.business.selectQuery;
import com.example.entitymanager1812.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import static com.example.entitymanager1812.business.selectQuery.selectUserQuery;

public interface UserRepository extends DemoRepository<User> {

}
