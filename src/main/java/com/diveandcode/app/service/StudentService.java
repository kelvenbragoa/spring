package com.diveandcode.app.service;

import com.diveandcode.app.dto.StudentDTO;
import com.diveandcode.app.entity.Student;
import com.diveandcode.app.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public List<StudentDTO> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return modelMapper.map(studentList, new TypeToken<List<StudentDTO>>(){}.getType());
    }

    public StudentDTO getOneStudents(int id){
        Optional<Student> student = studentRepository.findById(id);
        return modelMapper.map(student, new TypeToken<StudentDTO>(){}.getType());
    }

    public StudentDTO updateStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;
    }

    public boolean deleteStudent(StudentDTO studentDTO){
        studentRepository.delete(modelMapper.map(studentDTO, Student.class));
        return true;
    }
}
