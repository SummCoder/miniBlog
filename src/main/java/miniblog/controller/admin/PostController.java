package miniblog.controller.admin;

import miniblog.model.entity.Post;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @desc Admin Controller.
 * @author SummCoder
 * @date 2024/2/19 22:01
 */

@Controller
@RequestMapping("admin/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String postById(Integer id, Model model) {
        Optional<Post> optPost = postService.getPostById(id);
        Post post = optPost.orElse(new Post());
        model.addAttribute("post", post);
        return "admin/update";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post postContact(@RequestBody Post post) {
        return postService.addPost(post);
    }


    @PutMapping(path="/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatePost(@PathVariable("id") Integer id, Post post) {
        post.setId(id);
        Post result = postService.updatePost(post);
        if(!ObjectUtils.isEmpty(result)) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteOrder(@PathVariable("id") Integer id) {
        if(postService.deletePostById(id)){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

}
