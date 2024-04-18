package com.diveandcode.app.service;

import com.diveandcode.app.dto.CompanyDTO;
import com.diveandcode.app.entity.Company;
import com.diveandcode.app.entity.Company;
import com.diveandcode.app.repository.CompanyRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private ModelMapper modelMapper;

    public CompanyDTO saveCompany(CompanyDTO companyDTO){
        companyRepository.save(modelMapper.map(companyDTO, Company.class));
        return companyDTO;
    }

    public List<CompanyDTO> getAllCompany(){
        List<Company> deviceList = companyRepository.findAll();
        return modelMapper.map(deviceList, new TypeToken<List<CompanyDTO>>(){}.getType());
    }

    public CompanyDTO getOneCompany(int id){
        Optional<Company> device = companyRepository.findById(id);
        return modelMapper.map(device, new TypeToken<CompanyDTO>(){}.getType());
    }

    public CompanyDTO updateCompany(CompanyDTO companyDTO){
        companyRepository.save(modelMapper.map(companyDTO,Company.class));
        return companyDTO;
    }

    public boolean deleteCompany(CompanyDTO companyDTO){
        companyRepository.delete(modelMapper.map(companyDTO, Company.class));
        return true;
    }
}
