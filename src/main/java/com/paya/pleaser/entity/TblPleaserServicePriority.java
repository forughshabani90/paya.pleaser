package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class TblPleaserServicePriority {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="pleaser_service_priority_id" ,columnDefinition = "char(32)")
    private String pleaserServicePriorityId;
    @PrePersist
    public void generateId() {
        if (pleaserServicePriorityId == null) {
            pleaserServicePriorityId = UUID.randomUUID().toString();
        }
    }
@Column(name = "pleaser_service_priority_number",columnDefinition ="int" )
    private int pleaserServicePriorityNumber;

    @Column(name = "Pleaser_service_priority_pleaser_service_id" , columnDefinition = "char(32)")
    private String PleaserServicePriorityPleaserServiceId;

@Column(name = "pleaser_service_priority_veight",columnDefinition = "int")
    private int pleaserServicePriorityVeight;

@Column(name = "pleaser_service_priority_amount",columnDefinition = "float")
    private float pleaserServicePriorityAmount;
@Column(name = "pleaser_service_priority_allowed_count",columnDefinition = "int")
    private int pleaserServicePriorityAllowedCount;
@Column(name = "pleaser_service_priority_measurement_unit",columnDefinition = "int")
    private int pleaserServicePriorityMeasurementUnit;
@Column(name = "pleaser_service_priority_start_date",columnDefinition = "Date")
    private Date pleaserServicePriorityStartDate;
@Column(name = "pleaser_service_priority_end_date",columnDefinition = "Date")
    private Date pleaserServicePriorityEndDate;
@Column(name = "pleaser_service_priority_description",columnDefinition = "char(32")
    private String pleaserServicePriorityDescription;
@Column(name = "pleaser_service_priority_payment_method",columnDefinition = "int")
    private int pleaserServicePriorityPaymentMethod;
@Column(name = "pleaser_service_priority_prepayment",columnDefinition = "float")
    private float pleaserServicePriorityPrepayment;
@Column(name = "pleaser_service_priority_count_of_month_installments",columnDefinition = "int")
    private int pleaserServicePriorityCountOfMonthInstallments;
@Column(name = "pleaser_service_priority_cancel_option",columnDefinition = "boolean")
    private boolean pleaserServicePriorityCancelOption;
@Column(name = "pleaser_service_priority_maximum_cancellation_date",columnDefinition = "Date")
    private Date pleaserServicePriorityMaximumCancellationDate;


}
