package miniblog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/22 22:54
 */

@Controller
@RequestMapping("/admin/manage")
public class ManageController {
    @GetMapping
    public String manage() {
        return "admin/manage";
    }
}
