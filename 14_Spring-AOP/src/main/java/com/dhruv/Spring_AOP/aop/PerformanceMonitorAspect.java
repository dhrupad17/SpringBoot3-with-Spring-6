package com.dhruv.Spring_AOP.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitorAspect {

    public static final Logger LOGGER= LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    // Performance Monitoring Using Around Advice

    @Around("execution(* com.dhruv.Spring_AOP.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long start=System.currentTimeMillis();

        Object obj=jp.proceed();

        long end=System.currentTimeMillis();

        LOGGER.info("Time taken by: "+jp.getSignature().getName()+ " "+(end-start)+ " ms");

        return obj;

    }
}
