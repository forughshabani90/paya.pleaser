package com.paya.pleaser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

@Entity
@Data
public class Tbl_priority_condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private char priority_condition_id;
    private char priority_condition_pleaser_service_priority_id;
    private NVarcharJdbcType priority_condition_title;
    private NVarcharJdbcType priority_condition_field_title;
    private boolean priority_condition_status;
    private NVarcharJdbcType priority_condition_content;
    private boolean priority_condition_has_condition;


}
