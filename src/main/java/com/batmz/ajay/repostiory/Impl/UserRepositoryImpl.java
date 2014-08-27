package com.batmz.ajay.repostiory.Impl;

import com.batmz.ajay.dao.AbstractHibernateDao;
import com.batmz.ajay.model.User;
import com.batmz.ajay.repostiory.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ajay on 27/8/14.
 */

@Repository
public class UserRepositoryImpl extends AbstractHibernateDao<User> implements UserRepository {
}
