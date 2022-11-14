package com.sahil.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAspect {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.sahil.AOP.business.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Running before-{}",joinPoint);
    }

    @After("execution(* com.sahil.AOP.business.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info("Running after -{}",joinPoint);
    }


    @AfterReturning(value = "execution(* com.sahil.AOP.business.*.*(..))",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){
        logger.info("{} returned with value {}",joinPoint,result);
    }
}
