package miniblog.repository;

import miniblog.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/22 0:55
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
