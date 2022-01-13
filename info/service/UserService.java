package com.User_data.info.service;

import com.User_data.info.Repository.UserRepository;
import com.User_data.info.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findByIb(Long id){
        return userRepository.findById(id);
    }
    public void DeleteById(Long id){
        userRepository.deleteById(id);
    }
    public void Save(User user){
        userRepository.save(user);
    }
    public void Update(User user,Long id) {
      userRepository.save(user);
        }
    }



