package miniblog.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/21 19:33
 */

@Data
public class PostDTO {
    private Integer id;
    private String title;
    private String cover;
    private Date createTime;
    private String content;
}
