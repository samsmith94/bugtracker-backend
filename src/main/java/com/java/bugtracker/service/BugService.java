package com.java.bugtracker.service;

import com.java.bugtracker.model.Bug;
import com.java.bugtracker.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugService {

    @Autowired
    BugRepository bugRepository;

    public Bug createBug(Bug bug) {

        bugRepository.save(bug);
        return bug;
    }

    public List<Bug> readBugs() {

        List<Bug> bugs = (List<Bug>) bugRepository.findAll();

        return bugs;
    }
}
