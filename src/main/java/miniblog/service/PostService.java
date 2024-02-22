package miniblog.service;

import miniblog.model.entity.Post;

import java.util.List;
import java.util.Optional;

/**
 * @author SummCoder
 * @desc manage the blog
 * @date 2024/2/20 11:42
 */
public interface PostService {
    String greet();

    Post addPost(Post post);

    Boolean deletePostById(Integer id);

    Post updatePost(Post post);

    Optional<Post> getPostById(Integer id);

    List<Post> getPostByPage(Integer page);

    Long getTotalNumber();
}
