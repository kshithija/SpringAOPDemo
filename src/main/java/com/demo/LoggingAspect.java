package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // Call this method
    @Before("execution(* com.demo.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jointPoint){
    //    System.out.println(jointPoint.getSignature());
        String args= jointPoint.getArgs()[0].toString();
        System.out.println("Before Loggers with argument::"+args);
    }
    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("Afer Logger");
    }

    @Pointcut("execution(* com.demo.ShoppingCart.quantity())")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning : " + retVal);
    }
}
