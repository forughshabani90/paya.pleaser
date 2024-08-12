package com.paya.pleaser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.DateTimeUtils;
import org.hibernate.type.descriptor.jdbc.DecimalJdbcType;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.Date;

@Entity
@Data
public class Tbl_pleaser_service_priority {
    private char pleaser_service_priority_id;
    private TinyIntJdbcType pleaser_service_priority_number;
    private char Pleaser_service_priority_pleaser_service_id;
    private int pleaser_service_priority_veight;
    private DecimalJdbcType pleaser_service_priority_amount;
    private int pleaser_service_priority_allowed_count;
    private TinyIntJdbcType pleaser_service_priority_measurement_unit;
    private Date pleaser_service_priority_start_date;
    private Date pleaser_service_priority_end_date;
    private VarcharJdbcType pleaser_service_priority_description;
    private TinyIntJdbcType pleaser_service_priority_payment_method;
    private DecimalJdbcType pleaser_service_priority_prepayment;
    private SmallIntJdbcType pleaser_service_priority_count_of_month_installments;
    private boolean pleaser_service_priority_cancel_option;
    private Date pleaser_service_priority_maximum_cancellation_date;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
