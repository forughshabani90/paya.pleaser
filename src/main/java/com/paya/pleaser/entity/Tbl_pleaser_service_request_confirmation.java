package com.paya.pleaser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

@Entity
@Data
public class Tbl_pleaser_service_request_confirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private char pleaser_service_request_confirmation_id;
    private char pleaser_service_request_confirmation_pleaser_service_request_id;
    private char pleaser_service_request_confirmation_reviewer_personnel_id;
    private NVarcharJdbcType pleaser_service_request_confirmation_description;
    private TinyIntJdbcType pleaser_service_request_confirmation_status;

}