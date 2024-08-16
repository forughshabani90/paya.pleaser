package com.paya.pleaser.service;

import com.paya.pleaser.entity.TblPaymentRegime;
import com.paya.pleaser.repository.PaymentRegimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentRegimeService {
    @Autowired
    PaymentRegimRepository paymentRegimRepository;
    public List<TblPaymentRegime> getPaymentRegimeSRV(String id){
       List<TblPaymentRegime> result=paymentRegimRepository.findAll();
        if (id!=null){
            result=paymentRegimRepository.findTblPaymentRegimeByPaymentRegimeId(id);
        }
        return result;
    }
}
