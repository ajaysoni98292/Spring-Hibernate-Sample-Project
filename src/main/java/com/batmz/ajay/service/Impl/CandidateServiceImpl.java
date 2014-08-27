package com.batmz.ajay.service.Impl;

import com.batmz.ajay.dao.IOperations;
import com.batmz.ajay.model.Candidate;
import com.batmz.ajay.repostiory.CandidateRepository;
import com.batmz.ajay.service.AbstractService;
import com.batmz.ajay.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ajay on 27/8/14.
 */

@Service
public class CandidateServiceImpl extends AbstractService<Candidate>  implements CandidateService {

    public CandidateServiceImpl() {
        super();
    }

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    protected IOperations<Candidate> getDao() {

        return candidateRepository;
    }
}
