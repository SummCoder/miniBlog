package miniblog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SummCoder
 * @desc write the blog post
 * @date 2024/2/22 22:40
 */

@Controller
@RequestMapping("/admin/write")
public class WriteController {
    @GetMapping
    public String write() {
        return "editormd/editormd";
    }
}
