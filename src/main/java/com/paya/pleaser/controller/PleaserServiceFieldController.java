package com.paya.pleaser.controller;

import com.paya.pleaser.entity.TblPleaserServiceField;
import com.paya.pleaser.service.PleaserServiceFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PleaserServiceFieldController {
    @Autowired
    PleaserServiceFieldService pleaserServiceFieldService;

    @GetMapping("/pleaserServiceFieldService")
    public List<TblPleaserServiceField> getPleaserServiceFieldController(@RequestBody String id,
                                                                         @RequestBody String serviceId,
                                                                         @RequestBody String colour,
                                                                         @RequestBody float meterage,
                                                                         @RequestBody String size,
                                                                         @RequestBody int year) {
        return pleaserServiceFieldService.getPleaserServiceFieldSRV(id, serviceId, colour, meterage, size, year);

    }


}
