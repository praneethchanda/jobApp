package com.praneeth.demo.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Component
@Data
public class Job {

    @Id
    private int jobId;
    private String jobProfile;
    private String jobDescription;
    private int experience;
    private List<String> techStack;

}