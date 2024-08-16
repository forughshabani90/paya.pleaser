package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class TblPleaserServiceRequest {
    public TblPleaserServiceRequest() {

    }

    public TblPleaserServiceRequest(String uuid, LocalDateTime date) {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_id", columnDefinition = "char(32)")
    private String pleaser_service_request_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_applicant_personnel_id", columnDefinition = "char(32)")
    private String pleaser_service_request_applicant_personnel_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_pleaser_service_priority_id", columnDefinition = "char(32)")
    private String pleaser_service_request_pleaser_service_priority_id;

    private int pleaser_service_request_status;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_reviewer_personnel_id", columnDefinition = "char(32)")
    private String pleaser_service_request_reviewer_personnel_id;
}
