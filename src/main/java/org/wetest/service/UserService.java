package org.wetest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wetest.entity.User;
import org.wetest.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
  /*  public List<User> getUserListByName(String username){
        return userRepository.findUserByUserName(username);
    }*/
    public User getUserListById(Long id){
        return userRepository.findById(id).get();
    }
    public List<User> getUserListByUsername(String username){
        return userRepository.getUserListByUsername(username);
    }
}
