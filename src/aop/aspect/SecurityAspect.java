package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

//    @Before("aop.aspect.MyPointcuts.allAddmethods()")
//    public void beforeAddSecurityAdvice(){
//        System.out.println("beforeAddSecurityAdvice: Log #2");
//    }
}
