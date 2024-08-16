package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = " Tbl_payment-regime")
public class TblPaymentRegime {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_regime_id", columnDefinition = "char(32)")
    private String paymentRegimeId;

    @PrePersist
    public void generateId() {
        if (paymentRegimeId == null) {
            paymentRegimeId= UUID.randomUUID().toString();
        }
    }

    @Column(name = "payment_regim_pleaser_service_priority_id", columnDefinition = "char(32)")
    private String paymentRegimPleaserServicePriorityId;
    @Column(name = "payment_regime_content",columnDefinition = "char(32)")
    private String paymentRegimeContent;


}
