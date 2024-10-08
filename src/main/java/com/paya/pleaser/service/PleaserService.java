package com.paya.pleaser.service;

import com.paya.pleaser.entity.Tbl_pleaser_service;
import com.paya.pleaser.repository.Tbl_pleaser_service_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PleaserService {
    @Autowired
    Tbl_pleaser_service_repository tbl_pleaser_service_repository;

    public List<Tbl_pleaser_service> get(String id, String title, Date date) {
        List<Tbl_pleaser_service> result1 = tbl_pleaser_service_repository.findById(id);
        if (result1.isPresent()) {
            result1 = (List<Tbl_pleaser_service>) result1.get();
        }
        result1 = tbl_pleaser_service_repository.findByTitle(title);
        if (result1.isPresent()) {
            return (List<Tbl_pleaser_service>) result1.get();
        }
        result1 = tbl_pleaser_service_repository.findByDate(date);
        if (result1.isPresent()) {
            return (List<Tbl_pleaser_service>) result1.get();
        }
        return result1;

    }

    public Tbl_pleaser_service save(Tbl_pleaser_service tblPleaserService){
        return tbl_pleaser_service_repository.save(tblPleaserService);
    }
}
