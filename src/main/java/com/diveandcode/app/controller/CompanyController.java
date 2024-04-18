package com.diveandcode.app.controller;

import com.diveandcode.app.dto.CompanyDTO;
import com.diveandcode.app.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public List<CompanyDTO> getCompany(){
        return companyService.getAllCompany();
    }

    @GetMapping("/company/{id}")
    public CompanyDTO getOneCompany(@PathVariable("id") int id){
        return companyService.getOneCompany(id);
    }

    @PostMapping("/company")
    public CompanyDTO saveCompany(@Valid @RequestBody CompanyDTO companyDTO){
        return companyService.saveCompany(companyDTO);
    }

    @PutMapping("/company")
    public CompanyDTO updateCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.updateCompany(companyDTO);
    }

    @DeleteMapping("/company")
    public boolean deleteCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.deleteCompany(companyDTO);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
