package com.paya.pleaser.controller;

import com.paya.pleaser.entity.TblPleaserService;
import com.paya.pleaser.repository.PleaserServiceRepository;
import com.paya.pleaser.service.PleaserServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PleaserServiceController {
    @Autowired
    PleaserServiceService pleaserServiceService;

    @GetMapping("/pleaser-service")
    public List<TblPleaserService> getPleaserService(@RequestBody String p_id, @RequestBody String title) {
        return pleaserServiceService.getPleaserServiceSrv(p_id, title);
    }

//    @PostMapping
//    public TblPleaserService savePleaserService(@RequestBody TblPleaserService tbl_pleaser_service) {
//        return pleaserService.save(tbl_pleaser_service);
//    }
//
//    @GetMapping
//    public List<Tbl_pleaser_service> getPleaserService(x, y, z) {
//        servcve
//    }
}
