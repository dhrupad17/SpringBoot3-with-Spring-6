package com.dhruv.Spring_AOP.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(ValidationAspect.class);

    // Validating The Input Using Around Advice

    @Around("execution (* com.dhruv.Spring_AOP.service.JobService.getJob(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp,int postId)throws Throwable{

        if(postId<0){
            LOGGER.info(("PostId is negative, updating it"));

            postId=-postId;

            LOGGER.info("New PostId Value "+postId);
        }

        Object obj=jp.proceed(new Object[] {postId});

        return obj;

    }

}
