package com.java.bugtracker.repository;


import com.java.bugtracker.model.Bug;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends CrudRepository<Bug, Integer> {

}
