package com.diveandcode.app.service;

import com.diveandcode.app.dto.EmployeeDTO;
import com.diveandcode.app.entity.Employee;
import com.diveandcode.app.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
        return employeeDTO;
    }

    public List<EmployeeDTO> getAllEmployee(){
        List<Employee> deviceList = employeeRepository.findAll();
        return modelMapper.map(deviceList, new TypeToken<List<EmployeeDTO>>(){}.getType());
    }

    public EmployeeDTO getOneEmployee(int id){
        Optional<Employee> device = employeeRepository.findById(id);
        return modelMapper.map(device, new TypeToken<EmployeeDTO>(){}.getType());
    }

    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO){
        employeeRepository.save(modelMapper.map(employeeDTO,Employee.class));
        return employeeDTO;
    }

    public boolean deleteEmployee(EmployeeDTO employeeDTO){
        employeeRepository.delete(modelMapper.map(employeeDTO, Employee.class));
        return true;
    }
}
