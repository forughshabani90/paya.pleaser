package com.paya.pleaser.repository;

import com.paya.pleaser.entity.TblPleaserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PleaserServiceRepository extends JpaRepository<TblPleaserService,String> {
    List<TblPleaserService> findPleaserServiceByPleaserServiceId(String p_id);
    List<TblPleaserService> getPleaserServiceByPleaserServiceTitle(String title);

//   List<TblPleaserService> findByDate(Date pleaserServiceCreatedAt);

}

