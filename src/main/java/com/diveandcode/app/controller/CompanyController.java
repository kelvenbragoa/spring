package com.diveandcode.app.controller;

import com.diveandcode.app.dto.CompanyDTO;
import com.diveandcode.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companys")
    public List<CompanyDTO> getCompany(){
        return companyService.getAllCompany();
    }

    @GetMapping("/companys/{id}")
    public CompanyDTO getOneCompany(@PathVariable("id") int id){
        return companyService.getOneCompany(id);
    }

    @PostMapping("/companys")
    public CompanyDTO saveCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.saveCompany(companyDTO);
    }

    @PutMapping("/companys")
    public CompanyDTO updateCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.updateCompany(companyDTO);
    }

    @DeleteMapping("/companys")
    public boolean deleteCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.deleteCompany(companyDTO);
    }

}
