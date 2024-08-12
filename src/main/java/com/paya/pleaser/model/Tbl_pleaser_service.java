package com.paya.pleaser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.Date;

@Entity
@Data
public class Tbl_pleaser_service {
    private char pleaser_service_id;
    private VarcharJdbcType pleaser_service_service_number;
    private Date pleaser_service_created_at;
    private TinyIntJdbcType pleaser_service_type;
    private NVarcharJdbcType pleaser_service_title;
    private int pleaser_service_count;
    private char pleaser_service_personnel_id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
