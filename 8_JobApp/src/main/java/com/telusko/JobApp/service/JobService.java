package com.telusko.JobApp.service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    //method to return all JobPosts
    public List<JobPost> returnAllJobPosts(){
        return repo.returnAllJobPosts();
    }

    // method to add a jobPost
    public void addJobPost(JobPost jobPost){
        repo.addJobPost(jobPost);
    }
}
