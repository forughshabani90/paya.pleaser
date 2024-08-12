package com.paya.pleaser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

@Entity
@Data
public class Tbl_payment_regime {
    private char payment_regime_id;
    private char payment_regim_pleaser_service_priority_id;
    private VarcharJdbcType payment_regime_content;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
