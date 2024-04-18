package com.diveandcode.app.repository;
import com.diveandcode.app.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer>  {
}
