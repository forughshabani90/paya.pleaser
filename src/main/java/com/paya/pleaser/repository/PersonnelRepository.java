package com.paya.pleaser.repository;

import com.paya.pleaser.entity.TblPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelRepository extends JpaRepository<TblPersonnel,String> {
      List<TblPersonnel> findTblPersonnelByPersonnelId(String id);
      List<TblPersonnel> findTblPersonnelByPersonnelFirstName(String firstName);
      List<TblPersonnel> findTblPersonnelByPersonnelLastName(String lastName);
      List<TblPersonnel> findTblPersonnelByPersonnelEnterpriseId(String enterpriseId);
      List<TblPersonnel> findTblPersonnelByPersonnelNationalCode(String nationalCode);
}
