package com.diveandcode.app.repository;
import com.diveandcode.app.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Integer> {
}
