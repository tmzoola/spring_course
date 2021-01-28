package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void onlyReturnMethodFromUnilibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !onlyReturnMethodFromUnilibrary()")
//    private void allMethodsFromUniLibraryExceptReturnMagazine(){}
//
//    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
//    public void beforeAllMethodsAxceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsAxceptReturnMagazineAdvice: writing Log #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }



//    @Before("aop.aspect.MyPointcuts.allAddmethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature = " + methodSignature);
//        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
//        System.out.println("methodSignature.getReturnType()  = " + methodSignature.getReturnType());
//        System.out.println("methodSignature.getName()  = " + methodSignature.getName());
//
//        if (methodSignature.getName().equals("addBook")){
//            Object[] arguments = joinPoint.getArgs();
//            for (Object obj : arguments) {
//                if (obj instanceof Book){
//                    Book myBook = (Book) obj;
//                    System.out.println("Information about the book: name - " + myBook.getName() + ", author - " + myBook.getAuthor()
//                            +", year of publish " + myBook.getYearOfPublication() );
//                    System.out.println("------------------------------------------------------");
//                }
//                else if (obj instanceof String){
//                    System.out.println( "Only " + obj + " can add books");
//                }
//            }
//        }
//        System.out.println("beforeAddLoggingAdvice: Log #1");
//    }


}
