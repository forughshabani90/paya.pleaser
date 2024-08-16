package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "Tbl_pleaser_service_field")
public class TblPleaserServiceField {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " pleaser_service_field_id", columnDefinition = "char(32)")
    private String pleaserServiceFieldId;

    @PrePersist
    public void generateid() {
        if (pleaserServiceFieldId == null) {
            pleaserServiceFieldId = UUID.randomUUID().toString();
        }
    }

    @Column(name = "pleaser_service_field_pleaser_service_id", columnDefinition = "char(32)")
    private String PleaserServiceFieldPleaserServiceId;
    @Column(name = " pleaser_service_field_colour", columnDefinition = "char(32)")
    private String pleaserServiceFieldColour;
    @Column(name = "pleaser_service_field_meterage", columnDefinition = "float")
    private float pleaserServiceFieldMeterage;
    @Column(name = "Pleaser_service_field_size", columnDefinition = "char(32)")
    private String PleaserServiceFieldSize;
    @Column(name = "pleaser_service_field_production_year", columnDefinition = "int")
    private int pleaserServiceFieldProductionYear;


}
