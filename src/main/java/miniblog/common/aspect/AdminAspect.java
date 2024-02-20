package miniblog.common.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author SummCoder
 * @desc Admin AOP
 * @date 2024/2/20 22:09
 */

@Aspect
@Component
public class AdminAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * define a pointcut
     */
    @Pointcut("execution(* miniblog.service.impl.AdminServiceImpl.*( .. ))")
    public void log() {

    }

    @Before("log()")
    public void before() {
        logger.info("调用方法之前");
    }

    @After("log()")
    public void after() {
        logger.info("调用方法之后");
    }

    @AfterReturning("log()")
    public void afterReturning() {
        logger.info("方法正常返回之后");
    }

    @AfterThrowing("log()")
    public void afterThrowing() {
        logger.info("方法抛出异常！");
    }

}
