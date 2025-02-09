package com.praneeth.demo.repo;

import com.praneeth.demo.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface repo extends JpaRepository<Job,Integer> {


}


