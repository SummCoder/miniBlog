package miniblog.controller.content;

import miniblog.model.dto.PostBriefDTO;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SummCoder
 * @desc home page
 * @date 2024/2/28 0:23
 */

@Controller
@RequestMapping
public class HomeController {
    private final PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/page/{pageNum}")
    public String getPostsByPage(@PathVariable Integer pageNum, Model model) {
        long totalNum = postService.getTotalNumber();
        List<PostBriefDTO> posts = postService.getPostByPage(pageNum);
        long lastPage;
        int pageSize = 8;
        if (totalNum % pageSize == 0){
            lastPage = totalNum / pageSize;
        }else {
            lastPage = totalNum / pageSize + 1;
        }
        model.addAttribute("lastPage", lastPage);
        model.addAttribute("currentPage", pageNum);
        model.addAttribute("posts", posts);
        return "content/home";
    }
}
