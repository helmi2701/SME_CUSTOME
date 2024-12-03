package com.rpb.policy_decision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rpb.policy_decision.model.ICRECR.CellphoneResult;
import com.rpb.policy_decision.service.CellphoneService;

@RestController
@RequestMapping("/api/cellphone")
public class CellphoneController {

    @Autowired
    private CellphoneService cellphoneService;

    @GetMapping
    public ResponseEntity<List<CellphoneResult>> getCIFProfile(@RequestParam("mapId") String mapId) {
        List<CellphoneResult> profiles = cellphoneService.getCellphoneResultByMapId(mapId);
        if (profiles.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.ok(profiles); // 200 OK dengan data
    }
}
