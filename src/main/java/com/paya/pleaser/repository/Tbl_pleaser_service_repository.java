package com.paya.pleaser.repository;

import com.paya.pleaser.entity.Tbl_pleaser_service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface Tbl_pleaser_service_repository extends JpaRepository<Tbl_pleaser_service,String> {
    List<Tbl_pleaser_service> findByTitle(String pleaserServiceTitle);

   List<Tbl_pleaser_service> findByDate(Date pleaserServiceCreatedAt);

}
