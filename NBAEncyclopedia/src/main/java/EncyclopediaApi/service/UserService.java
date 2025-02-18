package EncyclopediaApi.service;

import EncyclopediaApi.model.User;
import EncyclopediaApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @Autowired
//    private AuthenticationManager authenticationManager;

    public User registerUser(User user) {
        userRepository.save(user);
        return user;
    }

    public List<User> getAllEmail() {
        return userRepository.findAll();
    }
}
