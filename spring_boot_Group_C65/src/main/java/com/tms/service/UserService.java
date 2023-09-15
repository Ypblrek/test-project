package com.tms.service;

import com.tms.Domain.Role;
import com.tms.Domain.UserInfo;
import com.tms.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserInfo> getUsers() {
        return userRepository.findAll();

    }

    public Optional<UserInfo> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public void createUser(UserInfo userInfo) {
        userInfo.setCreatedAt(LocalDateTime.now());
        userInfo.setUpdatedAt(LocalDateTime.now());
        userRepository.save(userInfo);

    }

    public void updatedUser(UserInfo userInfo) {
        userInfo.setUpdatedAt(LocalDateTime.now());
        userRepository.saveAndFlush(userInfo);
    }

    public Optional<UserInfo> findUsersByLastName(String firstName){
        return userRepository.findUsersByLastName(firstName);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}

