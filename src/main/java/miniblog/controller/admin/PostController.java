package miniblog.controller.admin;

import miniblog.model.entity.Post;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/{id}")
    public ResponseEntity<Post> postById(@PathVariable("id") Integer id) {
        Optional<Post> optPost = postService.getPostById(id);
        return optPost.map(post -> new ResponseEntity<>(post, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post postContact(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @PutMapping(path="/{id}", consumes="application/json")
    public Post putOrder(
            @PathVariable("id") Integer id,
            @RequestBody Post post) {
        post.setId(id);
        return postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteOrder(@PathVariable("id") Integer id) {
        if(postService.deletePostById(id)){
            return new ResponseEntity<>(true, HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }



}
