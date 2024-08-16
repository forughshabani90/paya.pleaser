package com.paya.pleaser.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "Tbl-personnel")
public class TblPersonnel {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " personnel_id", columnDefinition = "char(32)")
    private String personnelId;
    @PrePersist
    public void generateId() {
        if (personnelId == null) {
            personnelId = UUID.randomUUID().toString();
        }
    }
    @Column(name = " personnel_first_name",columnDefinition = "char(32)")
    private String personnelFirstName;

    @Column(name = "personnel_last_name",columnDefinition = "char(32)")
    private String personnelLastName;

    @Column(name = "personnel_enterprise_id", columnDefinition = "char(32)")
    private String personnelEnterpriseId;

    @Column(name = "personnel_national_code",columnDefinition = "char(32)")
    private String personnelNationalCode;


}
