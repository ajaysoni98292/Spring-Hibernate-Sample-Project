package com.batmz.ajay.repostiory.Impl;

import com.batmz.ajay.dao.AbstractHibernateDao;
import com.batmz.ajay.model.Candidate;
import com.batmz.ajay.repostiory.CandidateRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ajay on 27/8/14.
 */

@Repository
public class CandidateRepositoryImpl extends AbstractHibernateDao<Candidate> implements CandidateRepository {
}
