package com.luv2code.springboot.demosecurity.service;

import com.luv2code.springboot.demosecurity.dao.FeedBackRepository;
import com.luv2code.springboot.demosecurity.entity.FeedBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService  {
    private FeedBackRepository feedBackRepository;
    @Autowired
    public FeedBackServiceImpl(FeedBackRepository theFeedBackRepository){
        feedBackRepository=theFeedBackRepository;
    }
    @Override
    public FeedBack save(FeedBack theFeedBack) {
        return feedBackRepository.save(theFeedBack);
    }
}
