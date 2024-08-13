package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

@Entity
@Data
public class Tbl_personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " personnel_id",columnDefinition = "char(32)")
    private char personnel_id;
    private String personnel_first_name;
    private String personnel_last_name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personnel_enterprise_id", columnDefinition = "char(32)")
    private String personnel_enterprise_id;
    private String personnel_national_code;


}
