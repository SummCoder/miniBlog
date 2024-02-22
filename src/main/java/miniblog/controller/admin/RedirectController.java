package miniblog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SummCoder
 * @desc Just a redirect
 * @date 2024/2/22 22:43
 */

@Controller
@RequestMapping("/manage")
public class RedirectController {
    @GetMapping
    public String redirect() {
        return "redirect:/admin/manage";
    }
}
