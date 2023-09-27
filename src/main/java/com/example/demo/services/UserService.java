package com.example.demo.services;
import com.example.demo.models.Users;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public ArrayList<Users> getAllUsers(){
        return (ArrayList<Users>) userRepository.findAll();
    }
    public Optional<Users> getUserById(Integer id_user){
        return userRepository.findById(id_user);
    }
    public Users createUser(Users user){
        return userRepository.save(user);
    }
    public void deleteUser(Integer id_User){
        userRepository.deleteById(id_User);
    }
}
