package miniblog.controller.content;

import miniblog.model.dto.PostBriefDTO;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/page")
    @ResponseBody
    public ResponseEntity<?> getPostsByPage(@RequestParam Integer pageNum) {
        long totalNum = postService.getTotalNumber();
        List<PostBriefDTO> posts = postService.getPostByPage(pageNum);

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("totalNum", totalNum);
        responseData.put("postList", posts);

        return ResponseEntity.ok(responseData);
    }
}
