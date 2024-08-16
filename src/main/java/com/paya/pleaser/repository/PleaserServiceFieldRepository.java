package com.paya.pleaser.repository;

import com.paya.pleaser.entity.TblPleaserServiceField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PleaserServiceFieldRepository extends JpaRepository<TblPleaserServiceField,String> {
List<TblPleaserServiceField> findTblPleaserServiceFieldByPleaserServiceFieldId(String id);
List<TblPleaserServiceField> findTblPleaserServiceFieldBypPleaserServiceFieldPleaserServiceid(String id);
List<TblPleaserServiceField> findTblPleaserServiceFieldByPleaserServiceFieldColour(String colour);
List<TblPleaserServiceField> findTblPleaserServiceFieldByPleaserServiceFieldMeterage(float meterage);
List<TblPleaserServiceField> findTblPleaserServiceFieldByPleaserServiceFieldSize(String size);
List<TblPleaserServiceField> findTblPleaserServiceFieldByPleaserServiceFieldProductionYear(int year);
}
