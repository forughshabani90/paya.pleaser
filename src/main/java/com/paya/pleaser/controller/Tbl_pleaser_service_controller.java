package com.paya.pleaser.controller;

import com.paya.pleaser.model.Tbl_pleaser_service;
import com.paya.pleaser.repository.Tbl_pleaser_service_repository;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class Tbl_pleaser_service_controller {
    @Autowired
    Tbl_pleaser_service_repository tbl_pleaser_service_repository;

    @GetMapping
    public Tbl_pleaser_service getById(@PathVariable("id") Long id) {
        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findById(id);
        if (tbl_service1.isPresent()) {
            return tbl_service1.get();
        }
        return null;
    }

    @GetMapping
    public Tbl_pleaser_service getByName(@PathVariable("title") NVarcharJdbcType pleaser_service_title) {
        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findByTitle(pleaser_service_title);
        if (tbl_service1.isPresent()) {
            return tbl_service1.get();
        }
        return null;
    }

    @GetMapping
    public Tbl_pleaser_service getByTime(@PathVariable("date") Tbl_pleaser_service pleaser_service_created_at) {
        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findByDate(pleaser_service_created_at);
        if (tbl_service1.isPresent()) {
            return tbl_service1.get();
        }
        return null;
    }

    @PostMapping
    public Tbl_pleaser_service save(@RequestBody Tbl_pleaser_service tbl_pleaser_service) {
        return tbl_pleaser_service_repository.save(tbl_pleaser_service);

    }
}
