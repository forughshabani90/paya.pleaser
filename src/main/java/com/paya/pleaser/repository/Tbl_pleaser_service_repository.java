package com.paya.pleaser.repository;

import com.paya.pleaser.model.Tbl_pleaser_service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Tbl_pleaser_service_repository extends JpaRepository<Tbl_pleaser_service,Long> {
    Optional<Tbl_pleaser_service> findByTitle(Tbl_pleaser_service pleaserServiceTitle);

    Optional<Tbl_pleaser_service> findByDate(Tbl_pleaser_service pleaserServiceCreatedAt);

}
