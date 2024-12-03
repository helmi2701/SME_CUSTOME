package com.rpb.policy_decision.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpb.policy_decision.model.ICRECR.CellphoneResult;
import com.rpb.policy_decision.repository.CellphoneRepository;

@Service
public class CellphoneService {

    @Autowired
    CellphoneRepository cellphoneRepository;

    // Konstruktor tanpa argumen cukup jika sudah menggunakan @Autowired
    public CellphoneService(CellphoneRepository cellphoneRepository) {
        this.cellphoneRepository = cellphoneRepository;
    }

    // Mendapatkan data CellphoneResult berdasarkan MAP_ID
    public List<CellphoneResult> getCellphoneResultByMapId(String mapId) {
        return cellphoneRepository.findByMapId(mapId);
    }
}
