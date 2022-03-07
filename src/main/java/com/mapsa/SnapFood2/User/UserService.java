package com.mapsa.SnapFood2.User;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()){
            throw new RuntimeException();
        }
        return optionalUser.get();
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }
}
