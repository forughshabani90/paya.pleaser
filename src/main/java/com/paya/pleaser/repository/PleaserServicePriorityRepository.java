package com.paya.pleaser.repository;

import com.paya.pleaser.entity.TblPleaserServicePriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PleaserServicePriorityRepository extends JpaRepository<TblPleaserServicePriority,String> {
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityId(String id);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityNumber(int num);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesByPleaserServicePriorityPleaserServiceId(String id);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityVeight(int veight);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityAmount(float amount);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityAllowedCount(int count);
    List<TblPleaserServicePriority> findTblPleaserServicePrioritiesBypleaserServicePriorityMeasurementUnit(int unit);




}
