package miniblog.controller.admin;

import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final PostService postService;

    @Autowired
    public WriteController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String write() {
        return "/admin/write";
    }
}
