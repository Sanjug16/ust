package com.ust.JobNotificationApplication.service;

import com.ust.JobNotificationApplication.model.JobNotificationModel;
import com.ust.JobNotificationApplication.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNotificationService {
    @Autowired
    private JobRepository repo;

    public JobNotificationModel addnewjob(JobNotificationModel newjob){
        return repo.save(newjob);
    }
    public List<JobNotificationModel>getAllJobs(){
        return repo.findAll();
    }

    public JobNotificationModel getjobbyid(int jobId) {
        return repo.findById(jobId).orElse(null);
    }

    public JobNotificationModel updatejob(int jobId, JobNotificationModel newjob) {
        JobNotificationModel oldjob = repo.findById(jobId).orElse(null);
        if(oldjob != null)
        {
            oldjob.setJobId(newjob.getJobId());
            oldjob.setJobTitle(newjob.getJobTitle());
            oldjob.setDescription(newjob.getDescription());
            oldjob.setLocation(newjob.getLocation());
            oldjob.setSalary(newjob.getSalary());
            return repo.save(oldjob);
        }
        return newjob;
    }


    public String deletejob(int JobId) {
        repo.deleteById(JobId);
        return "Job was deleted";
    }
}
