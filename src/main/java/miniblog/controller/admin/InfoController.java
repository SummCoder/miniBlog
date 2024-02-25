package miniblog.controller.admin;

import miniblog.model.dto.UserDTO;
import miniblog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SummCoder
 * @desc manage the user information
 * @date 2024/2/24 22:11
 */

@Controller
@RequestMapping("/admin/info")
public class InfoController {

    private final UserService userService;

    public InfoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getInfo() {
        return "/admin/info";
    }

    @PostMapping
    public void updateInfo(UserDTO userDTO) {
        userService.updateUser(userDTO);
    }
}
