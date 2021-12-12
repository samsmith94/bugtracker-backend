package com.java.bugtracker.controller;

import com.java.bugtracker.model.Bug;
import com.java.bugtracker.service.BugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/api/bug")
public class BugController {

    @Autowired
    private BugService bugService;

    @GetMapping(path="all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Bug> listAllBugs() {

        return bugService.readBugs();
    }

    @PostMapping(path = "add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Bug addNewBug(@RequestBody Bug bug) {

        Bug newBug = new Bug();
        newBug.setName(bug.getName());
        newBug.setReporter(bug.getReporter());

        bugService.createBug(newBug);
        return newBug;
    }
}
