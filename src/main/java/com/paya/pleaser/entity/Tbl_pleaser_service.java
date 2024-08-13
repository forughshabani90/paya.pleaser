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
    @Column(name = "pleaser_service_id",columnDefinition = "(32)")
    private S pleaser_service_id;
    private VarcharJdbcType pleaser_service_service_number;
    private Date pleaser_service_created_at;
    private TinyIntJdbcType pleaser_service_type;
    private NVarcharJdbcType pleaser_service_title;
    private int pleaser_service_count;
    private char pleaser_service_personnel_id;
}
