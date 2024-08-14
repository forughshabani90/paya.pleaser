package com.paya.pleaser.controller;

import com.paya.pleaser.entity.Tbl_pleaser_service;
import com.paya.pleaser.repository.Tbl_pleaser_service_repository;
import com.paya.pleaser.service.PleaserService;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class PleaserServiceController {
    @Autowired
    PleaserService pleaserService;

//    @GetMapping
//    public Tbl_pleaser_service getById(@PathVariable("id") Long id) {
//        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findById(id);
//        if (tbl_service1.isPresent()) {
//            return tbl_service1.get();
//        }
//        return null;
//    }
//
//    @GetMapping
//    public Tbl_pleaser_service getByName(@PathVariable("title") NVarcharJdbcType pleaser_service_title) {
//        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findByTitle(pleaser_service_title);
//        if (tbl_service1.isPresent()) {
//            return tbl_service1.get();
//        }
//        return null;
//    }
//
//    @GetMapping
//    public Tbl_pleaser_service getByTime(@PathVariable("date") Tbl_pleaser_service pleaser_service_created_at) {
//        Optional<Tbl_pleaser_service> tbl_service1 = tbl_pleaser_service_repository.findByDate(pleaser_service_created_at);
//        if (tbl_service1.isPresent()) {
//            return tbl_service1.get();
//        }
//        return null;
//    }


    @GetMapping
    public List<Tbl_pleaser_service> getPleaserService(@RequestBody String id, @RequestBody String title, @RequestBody Date date) {
        return pleaserService.get(id, title, date);
    }

    @PostMapping
    public Tbl_pleaser_service save(@RequestBody Tbl_pleaser_service tbl_pleaser_service) {
        return pleaserService.save(tbl_pleaser_service);
    }

    @GetMapping
    public List<Tbl_pleaser_service> getPleaserService(x, y, z) {
        servcve
    }
}
