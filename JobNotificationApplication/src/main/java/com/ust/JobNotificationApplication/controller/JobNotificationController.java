package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.JobNotificationModel;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {

    @Autowired
    private JobNotificationService service;

    @PostMapping("/addnewjob")
    public JobNotificationModel addnewjob(@RequestBody JobNotificationModel newjob){
        return service.addnewjob(newjob);
    }

    @GetMapping("/jobs")
    public List<JobNotificationModel> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobs/{JobId}")
    public JobNotificationModel getjobbyid(@PathVariable int JobId){
        return service.getjobbyid(JobId);
    }
}
