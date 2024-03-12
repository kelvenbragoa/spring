package com.diveandcode.app.controller;

import com.diveandcode.app.dto.StudentDTO;
import com.diveandcode.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<StudentDTO> getStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDTO getOneStudent(@PathVariable("id") int id){
        return studentService.getOneStudents(id);
    }

    @PostMapping("/students")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping("/students")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/students")
    public boolean deleteStudent(@RequestBody StudentDTO studentDTO){
        return studentService.deleteStudent(studentDTO);
    }

}
