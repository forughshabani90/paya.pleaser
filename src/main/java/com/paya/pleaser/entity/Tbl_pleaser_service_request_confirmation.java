package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

@Entity
@Data
public class Tbl_pleaser_service_request_confirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_confirmation_id" , columnDefinition = "char(32)")
    private String pleaser_service_request_confirmation_id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_confirmation_pleaser_service_request_id" , columnDefinition = "char(32)")
    private String pleaser_service_request_confirmation_pleaser_service_request_id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_request_confirmation_reviewer_personnel_id" , columnDefinition = "char(32)")
    private String pleaser_service_request_confirmation_reviewer_personnel_id;

    private String pleaser_service_request_confirmation_description;
    private int pleaser_service_request_confirmation_status;

}