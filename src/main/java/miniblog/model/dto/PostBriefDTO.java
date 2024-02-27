package miniblog.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author SummCoder
 * @desc
 * @date 2024/2/26 22:31
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostBriefDTO {
    private Integer id;
    private String title;
    private Date createTime;
}
