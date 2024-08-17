package com.telusko.rest.service;

import com.telusko.rest.model.JobPost;
import com.telusko.rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    //method to return all JobPosts
    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    // method to add a jobPost
    public void addhJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public JobPost getJob(int postId){
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost){
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId){
        repo.deleteJob(postId);
    }
}
