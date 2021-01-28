package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

//    @Before("aop.aspect.MyPointcuts.allAddmethods()")
//    public void beforeAddExceptionHandlingAdvice(){
//        System.out.println("beforeAddExceptionHandlingAdvice: get/parse exception in while getting book/magazine");
//    }
}
