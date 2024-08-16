package com.paya.pleaser.controller;

import com.paya.pleaser.entity.TblPersonnel;
import com.paya.pleaser.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonnelController {
    @Autowired
    PersonnelService personnelService;

    @GetMapping("/personnel")
    public List<TblPersonnel> getPersonnel(@RequestBody String personnelId,
                                           @RequestBody String personnelFirstName,
                                           @RequestBody String personnelLastName,
                                           @RequestBody String personnelEnterpriseId,
                                           @RequestBody String personnelNationalCode) {
        return personnelService.getPersonnelSRV(personnelId,
                personnelFirstName, personnelLastName, personnelEnterpriseId
                , personnelNationalCode);
    }

}
