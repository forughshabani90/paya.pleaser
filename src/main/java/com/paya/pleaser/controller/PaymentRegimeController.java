package com.paya.pleaser.controller;

import com.paya.pleaser.entity.TblPaymentRegime;
import com.paya.pleaser.service.PaymentRegimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PaymentRegimeController {
    @Autowired
    PaymentRegimeService paymentRegimeService;

    @GetMapping("payment_regime")
    public List<TblPaymentRegime> getPaymentRegime(@RequestBody String id) {
        return paymentRegimeService.getPaymentRegimeSRV(id);
    }
}
