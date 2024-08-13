package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.Date;

@Entity
@Data
public class Tbl_pleaser_service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_id", columnDefinition = "char(32)")
    private String pleaser_service_id;

    private String pleaser_service_service_number;
    private Date pleaser_service_created_at;
    private int pleaser_service_type;
    private String pleaser_service_title;
    private int pleaser_service_count;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_personnel_id", columnDefinition = "char(32)")
    private String pleaser_service_personnel_id;
}
