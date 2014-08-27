package com.batmz.ajay.service.Impl;

import com.batmz.ajay.dao.IOperations;
import com.batmz.ajay.model.User;
import com.batmz.ajay.repostiory.UserRepository;
import com.batmz.ajay.service.AbstractService;
import com.batmz.ajay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ajay on 27/8/14.
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    public UserServiceImpl() {
        super();
    }

    @Autowired
    UserRepository userRepository;

    @Override
    protected IOperations<User> getDao() {
        return userRepository;
    }
}
