package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

@Entity
@Data
public class Tbl_priority_condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "priority_condition_id" , columnDefinition = "char(32)")
    private String priority_condition_id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "priority_condition_pleaser_service_priority_id" , columnDefinition = "char(32)")
    private String priority_condition_pleaser_service_priority_id;

    private String priority_condition_title;
    private String priority_condition_field_title;
    private boolean priority_condition_status;
    private String priority_condition_content;
    private boolean priority_condition_has_condition;


}
