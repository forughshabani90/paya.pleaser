package com.paya.pleaser.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;

@Entity
@Data
public class Tbl_pleaser_service_field {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private char pleaser_service_field_id;
    private char getPleaser_service_field_pleaser_service_id;
    private NVarcharJdbcType pleaser_service_field_colour;
    private float pleaser_service_field_meterage;
    private NVarcharJdbcType Pleaser_service_field_size;
    private SmallIntJdbcType pleaser_service_field_production_year;


}
