package com.praneeth.demo.service;

import com.praneeth.demo.model.Job;
import com.praneeth.demo.repo.repo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private repo rep;


    List<Job> jobs = new ArrayList<>(Arrays.asList(
            new Job(101, "Software Engineer", "Develop and maintain web applications.", 3, Arrays.asList("Java", "Spring", "MySQL", "React")),
            new Job(102, "Data Scientist", "Analyze large datasets to extract actionable insights.", 4, Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow")),
            new Job(103, "DevOps Engineer`", "Ensure smooth deployment and integration of software.", 5, Arrays.asList("AWS", "Docker", "Kubernetes", "CI/CD")),
            new Job(104, "UI/UX Designer", "Design user-friendly interfaces for web and mobile applications.", 2, Arrays.asList("Figma", "Sketch", "HTML", "CSS")),
            new Job(105, "Mobile Developer", "Build and maintain Android and iOS applications.", 3, Arrays.asList("Kotlin", "Swift", "Flutter"))
    ));
//    repo.saveAll();
    @PostConstruct
    public void init(){
        rep.saveAll(jobs);
    }
    public List<Job> getAllJobs() {
        return rep.findAll();
    }

}
