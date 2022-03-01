package org.example.homework.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("execution(public void validate(*))")
    public void afterValidateAdvice (JoinPoint joinPoint) throws InterruptedException {
        System.out.println("банк проверяет ваши учетные данные!");
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Object[] args =joinPoint.getArgs();
        for(Object obj:args){
            if(obj instanceof String){

            }
        }

    }

}
