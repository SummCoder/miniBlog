package miniblog.service.impl;

import miniblog.model.entity.Post;
import miniblog.repository.PostRepository;
import miniblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author SummCoder
 * @desc implementation of {@link PostService}
 * @date 2024/2/20 11:43
 */

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public String greet() {
        return "hello world";
    }

    /**
     * @desc create and save the post
     * @param post the post to add
     * @return created post
     */
    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    /**
     * @desc delete the post by id
     * @param id post id
     * @return boolean
     */
    @Override
    public Boolean deletePostById(Integer id) {
        postRepository.deleteById(id);
        return false;
    }

    /**
     * @desc update the post
     * @param post post to update
     * @return post after update
     */
    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }


    /**
     * @desc get post by id
     * @param id postId
     * @return result
     */
    @Override
    public Optional<Post> getPostById(Integer id) {
        return postRepository.findById(id);
    }


    /**
     * @desc get posts by pageNum
     * @param page pageNum
     * @return list of posts
     */
    @Override
    public List<Post> getPostByPage(Integer page) {
        PageRequest request = PageRequest.of(page - 1, 5);
        return postRepository.findAll(request).getContent();
    }

    /**
     * @return the total num of posts
     */
    @Override
    public Long getTotalNumber() {
        return postRepository.count();
    }


}
