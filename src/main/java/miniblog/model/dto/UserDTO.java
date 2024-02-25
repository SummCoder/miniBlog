package miniblog.model.dto;

import lombok.Data;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/24 23:05
 */
@Data
public class UserDTO {
    private String username;
    private String password;
    private String confirmPassword;
}
