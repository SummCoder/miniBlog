package miniblog.repository;

import miniblog.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SummCoder
 * @desc Post JPA repository
 * @date 2024/2/21 14:08
 */
public interface PostRepository extends JpaRepository<Post, Integer> {

}
