package miniblog.controller.admin;

import miniblog.model.entity.Post;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author SummCoder
 * @desc write the blog post
 * @date 2024/2/22 22:40
 */

@Controller
@RequestMapping("admin/write")
public class WriteController {
    private final PostService postService;

    @Autowired
    public WriteController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Boolean> createPost(Post post) {
        Post result = postService.addPost(post);
        if(!ObjectUtils.isEmpty(result)) {
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
    }

}
