package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;

@Entity
@Data
public class Tbl_pleaser_service_field {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " pleaser_service_field_id", columnDefinition = "char(32)")
    private String pleaser_service_field_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "getPleaser_service_field_pleaser_service_id" , columnDefinition = "char(32)")
    private String getPleaser_service_field_pleaser_service_id;

    private String pleaser_service_field_colour;
    private float pleaser_service_field_meterage;
    private String Pleaser_service_field_size;
    private int pleaser_service_field_production_year;


}
