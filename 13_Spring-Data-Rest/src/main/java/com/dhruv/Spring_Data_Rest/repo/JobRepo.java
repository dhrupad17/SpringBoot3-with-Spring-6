package com.dhruv.Spring_Data_Rest.repo;

import com.dhruv.Spring_Data_Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {
}
