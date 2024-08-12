package com.paya.pleaser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

@Entity
@Data
public class Tbl_personnel {
    private char personnel_id;
    private NVarcharJdbcType personnel_first_name;
    private NVarcharJdbcType personnel_last_name;
    private NVarcharJdbcType personnel_enterprise_id;
    private NVarcharJdbcType personnel_national_code;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
