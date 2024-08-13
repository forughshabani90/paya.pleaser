package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.DecimalJdbcType;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.Date;

@Entity
@Data
public class Tbl_pleaser_service_priority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="pleaser_service_priority_id" ,columnDefinition = "char(32)")
    private char pleaser_service_priority_id;

    private int pleaser_service_priority_number;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Pleaser_service_priority_pleaser_service_id" , columnDefinition = "char(32)")
    private String Pleaser_service_priority_pleaser_service_id;

    private int pleaser_service_priority_veight;
    private float pleaser_service_priority_amount;
    private int pleaser_service_priority_allowed_count;
    private int pleaser_service_priority_measurement_unit;
    private Date pleaser_service_priority_start_date;
    private Date pleaser_service_priority_end_date;
    private String pleaser_service_priority_description;
    private int pleaser_service_priority_payment_method;
    private float pleaser_service_priority_prepayment;
    private int pleaser_service_priority_count_of_month_installments;
    private boolean pleaser_service_priority_cancel_option;
    private Date pleaser_service_priority_maximum_cancellation_date;


}
