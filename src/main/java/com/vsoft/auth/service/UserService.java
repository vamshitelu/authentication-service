package com.vsoft.auth.service;

import com.vsoft.auth.entity.UserEntity;
import com.vsoft.auth.model.User;
import com.vsoft.auth.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public User registerUser(User user){
        UserEntity entity = modelMapper.map(user, UserEntity.class);
        UserEntity newEntity = userRepository.save(entity);
        return modelMapper.map(newEntity, User.class);
    }
}
