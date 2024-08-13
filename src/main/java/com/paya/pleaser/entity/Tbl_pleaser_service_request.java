package com.paya.pleaser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

@Entity
@Data
public class Tbl_pleaser_service_request {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private char pleaser_service_request_id;
    private char pleaser_service_request_applicant_personnel_id;
    private char pleaser_service_request_pleaser_service_priority_id;
    private TinyIntJdbcType pleaser_service_request_status;
    private char pleaser_service_request_reviewer_personnel_id;
}
