package com.praneeth.demo.controller;

import com.praneeth.demo.model.Job;
import com.praneeth.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private JobService service;

    @GetMapping("/posts")
    @ResponseBody
    public List<Job> getAllJobs(){
        return service.getAllJobs();
    }


}
