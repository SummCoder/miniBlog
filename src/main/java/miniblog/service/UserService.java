package miniblog.service;

import miniblog.model.dto.UserDTO;
import miniblog.model.entity.User;

/**
 * @author SummCoder
 * @desc manage the user information
 * @date 2024/2/24 23:07
 */
public interface UserService {
    User updateUser(UserDTO user);
}
