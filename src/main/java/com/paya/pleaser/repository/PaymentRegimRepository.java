package com.paya.pleaser.repository;

import com.paya.pleaser.entity.TblPaymentRegime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRegimRepository extends JpaRepository<TblPaymentRegime,String> {
      List<TblPaymentRegime> findTblPaymentRegimeByPaymentRegimeId(String id);

}
