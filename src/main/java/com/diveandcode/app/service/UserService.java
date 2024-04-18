package com.diveandcode.app.service;

import com.diveandcode.app.dto.UserDTO;
import com.diveandcode.app.entity.User;
import com.diveandcode.app.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser(){
        List<User> deviceList = userRepository.findAll();
        return modelMapper.map(deviceList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO getOneUser(int id){
        Optional<User> device = userRepository.findById(id);
        return modelMapper.map(device, new TypeToken<UserDTO>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepository.delete(modelMapper.map(userDTO, User.class));
        return true;
    }
}
