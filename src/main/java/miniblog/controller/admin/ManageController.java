package miniblog.controller.admin;

import miniblog.model.dto.PostBriefDTO;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/27 20:45
 */
@Controller
@RequestMapping("manage/post")
public class ManageController {

    private final PostService postService;

    @Autowired
    public ManageController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public String getPosts(Model model) {
        List<PostBriefDTO> posts = postService.getPosts();
        model.addAttribute("postList", posts);
        return "admin/post";
    }
}
