package miniblog.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author SummCoder
 * @desc Admin AOP
 * @date 2024/2/20 22:09
 */

@Slf4j
@Aspect
@Component
public class AdminAspect {

    /**
     * define a pointcut
     */
    @Pointcut("execution(* miniblog.service.impl.PostServiceImpl.deletePostById( .. ))")
    public void log() {

    }

    @Around("log()")
    public Boolean watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            log.info("调用方法之前");
            joinPoint.proceed();
            log.info("方法正常返回之后");
            return true;
        }catch (Throwable e){
            log.info("方法抛出异常！");
        }finally {
            log.info("调用方法之后");
        }
        return false;
    }

}
