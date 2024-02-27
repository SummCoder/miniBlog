package miniblog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author SummCoder
 * @desc thymeleaf.config
 * @date 2024/2/26 19:46
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("manage/info").setViewName("/admin/info");
        registry.addViewController("manage/write").setViewName("/admin/write");
    }
}
