package com.paya.pleaser.service;

import com.paya.pleaser.entity.TblPleaserService;
import com.paya.pleaser.repository.PleaserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PleaserServiceService {

    @Autowired
    PleaserServiceRepository pleaserServiceRepository;

    public List<TblPleaserService> getPleaserServiceSrv(String p_id, String title) {
        List<TblPleaserService> result = pleaserServiceRepository.findAll();
        if (p_id != null) {
            result = pleaserServiceRepository.findPleaserServiceByPleaserServiceId(p_id);
        }

        if (title != null) {
            result = pleaserServiceRepository.getPleaserServiceByPleaserServiceTitle(title);

        }
        return result;

    }
}