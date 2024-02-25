package miniblog.service.impl;

import miniblog.model.dto.UserDTO;
import miniblog.model.entity.User;
import miniblog.repository.UserRepository;
import miniblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author SummCoder
 * @desc implementation of UserService
 * @date 2024/2/24 23:08
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder encoder){
        this.userRepository = userRepository;
        this.encoder = encoder;
    }

    @Override
    public User updateUser(UserDTO user) {
        return userRepository.save(new User(0, user.getUsername(), encoder.encode(user.getPassword())));
    }
}
