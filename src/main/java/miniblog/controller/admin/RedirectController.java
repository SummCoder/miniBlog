package miniblog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/26 21:37
 */
@Controller
@RequestMapping("console")
public class RedirectController {

    @GetMapping
    public String redirect(){
        return "redirect:/manage/post";
    }
}
