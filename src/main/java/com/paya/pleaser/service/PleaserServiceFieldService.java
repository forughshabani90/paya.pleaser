package com.paya.pleaser.service;

import com.paya.pleaser.entity.TblPleaserServiceField;
import com.paya.pleaser.repository.PleaserServiceFieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PleaserServiceFieldService {
    PleaserServiceFieldRepository pleaserServiceFieldRepository;

    public List<TblPleaserServiceField> getPleaserServiceFieldSRV(String id, String serviceId,
                                                                  String colour, float meterage,
                                                                  String size, int year) {

        List<TblPleaserServiceField> result = pleaserServiceFieldRepository.findAll();
        if (id != null) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldByPleaserServiceFieldId(id);
        }
        if (serviceId != null) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldBypPleaserServiceFieldPleaserServiceid(serviceId);
        }
        if (colour != null) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldByPleaserServiceFieldColour(colour);
        }
        if (meterage != 0) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldByPleaserServiceFieldMeterage(meterage);
        }
        if (size != null) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldByPleaserServiceFieldSize(size);
        }
        if (year != 0) {
            result = pleaserServiceFieldRepository.findTblPleaserServiceFieldByPleaserServiceFieldProductionYear(year);
        }
        return result;
    }
}
