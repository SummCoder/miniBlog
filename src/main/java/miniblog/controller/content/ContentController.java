package miniblog.controller.content;

import miniblog.model.entity.Post;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author SummCoder
 * @desc Controller for post content
 * @date 2024/2/20 14:16
 */

@Controller
@RequestMapping("post")
public class ContentController {

    private final PostService postService;

    @Autowired
    public ContentController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(path="/{id}")
    public String postById(@PathVariable("id") Integer id, Model model) {
        Optional<Post> optPost = postService.getPostById(id);
        Post post = optPost.orElse(new Post());
        model.addAttribute("post", post);
        return "content/content";
    }
}