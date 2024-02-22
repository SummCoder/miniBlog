package miniblog.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author SummCoder
 * @desc Post entity
 * @date 2024/2/20 15:26
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Post cover
     */
    @Column(columnDefinition = "varchar(100) not null")
    private String cover;

    /**
     * Post title.
     */
    @Column(columnDefinition = "varchar(100) not null")
    private String title;

    /**
     * Post create date
     */
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    /**
     * Post Content
     */
    @Column(columnDefinition = "text not null")
    private String content;

}
