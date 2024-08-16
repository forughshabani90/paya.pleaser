package com.paya.pleaser.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tbl_pleaser_service")
public class TblPleaserService {


    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pleaser_service_id", columnDefinition = "char(32)")
    public String pleaserServiceId;


    @PrePersist
    public void generateId() {
        if (pleaserServiceId == null) {
            pleaserServiceId = UUID.randomUUID().toString();
        }
    }
    @Column(name = "pleaser_service_service_number", length = 15)
    public String pleaserServiceServiceNumber;

    @CreationTimestamp
    @Column(name = "pleaser_service_created_at")
    public Date pleaserServiceCreatedAt;

//    @Type(type = "numeric_boolean")
    @Column(name = "pleaser_service_type", columnDefinition = "TINYINT")
    public int pleaserServiceType;

    @Column(name = "pleaser_service_title", length = 50)
    public String pleaserServiceTitle;

    @Column(name = "pleaser_service_count", columnDefinition = "SMALLINT")
    public int pleaserServiceCount;

    @Column(name = "pleaser_service_personnel_id", columnDefinition = "char(32)", nullable = false)
    public String pleaserServicePersonnelId;
}
