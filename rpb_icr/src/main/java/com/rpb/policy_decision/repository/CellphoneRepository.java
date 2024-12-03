package com.rpb.policy_decision.repository;

import com.rpb.policy_decision.model.ICRECR.CellphoneResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CellphoneRepository extends JpaRepository<CellphoneResult, String> {
    List<CellphoneResult> findByMapId(String mapId);
}
