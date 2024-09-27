package com.ust.JobNotificationApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobNotificationModel {

    @Id
    private  int jobId;

    private String jobTitle;

    private String description;

    private String location ;

    private String salary;
}
