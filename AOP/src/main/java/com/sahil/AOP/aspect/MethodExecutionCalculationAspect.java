package com.sahil.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.sahil.AOP.business.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        joinPoint.proceed();

        long endTime =  System.currentTimeMillis() - startTime;
        logger.info("time taken by {} is {}",joinPoint,endTime);

    }

}
