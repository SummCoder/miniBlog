package miniblog.service.impl;

import miniblog.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * @author SummCoder
 * @desc implementation of {@link AdminService}
 * @date 2024/2/20 11:43
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public String greet() {
        return "hello world";
    }
}
