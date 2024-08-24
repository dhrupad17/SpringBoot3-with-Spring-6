package com.dhruv.Spring_AOP.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);


    //BEFORE ADVICE

    @Before("execution(* com.dhruv.Spring_AOP.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called "+jp.getSignature().getName());
    }

    // AFTER ADVICE EXECUTE IF EXCEPTION OCCURS TOO..

    @After("execution(* com.dhruv.Spring_AOP.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }

    // AFTER THROWING EXECUTES ONLY WHEN EXCEPTION OCCURS

    @AfterThrowing("execution(* com.dhruv.Spring_AOP.service.JobService.getJob(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }

    //AFTER RETURNING OCCURS WHEN NO EXCEPTION OCCURS

    @AfterReturning("execution(* com.dhruv.Spring_AOP.service.JobService.getJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
    }

}
