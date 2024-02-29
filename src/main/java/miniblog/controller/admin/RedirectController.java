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
@RequestMapping("/")
public class RedirectController {

    @RequestMapping("console")
    @GetMapping
    public String redirect(){
        return "redirect:/manage/post";
    }

    @RequestMapping
    @GetMapping
    public String redirect_home(){
        return "redirect:/page/1";
    }
}
