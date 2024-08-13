package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

@Entity
@Data
public class Tbl_payment_regime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_regime_id", columnDefinition = "char(32)")
    private String payment_regime_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_regim_pleaser_service_priority_id",columnDefinition = "char(32")
    private String payment_regim_pleaser_service_priority_id;
    private String payment_regime_content;


}
