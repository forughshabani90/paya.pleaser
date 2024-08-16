package com.paya.pleaser.service;

import com.paya.pleaser.entity.TblPersonnel;
import com.paya.pleaser.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelService {
    @Autowired
    PersonnelRepository personnelRepository;
    public List<TblPersonnel> getPersonnelSRV(String id, String firstName,
                                              String lastName, String enterpriseId,
                                              String nationalCode){
        List<TblPersonnel> result=personnelRepository.findAll();
        if (id!=null){
            result=personnelRepository.findTblPersonnelByPersonnelId(id);
        }
        if (firstName != null) {
            result=personnelRepository.findTblPersonnelByPersonnelFirstName(firstName);
        }
        if (lastName!=null){
            result=personnelRepository.findTblPersonnelByPersonnelLastName(lastName);
        }
        if (enterpriseId!=null){
            result=personnelRepository.findTblPersonnelByPersonnelEnterpriseId(enterpriseId);
        }
        if (nationalCode!=null){
            result=personnelRepository.findTblPersonnelByPersonnelNationalCode(nationalCode);
        }
        return result;
    }



}
