package miniblog.controller.admin;

import lombok.extern.slf4j.Slf4j;
import miniblog.model.dto.UserDTO;
import miniblog.model.entity.User;
import miniblog.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SummCoder
 * @desc manage the user information
 * @date 2024/2/24 22:11
 */
@Slf4j
@Controller
@RequestMapping("admin/info")
public class InfoController {

    private final UserService userService;

    public InfoController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Boolean> updateInfo(UserDTO userInfo) {
        User user = userService.updateUser(userInfo);
        log.info("User updated: " + user);
        if (!ObjectUtils.isEmpty(user)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }
}
