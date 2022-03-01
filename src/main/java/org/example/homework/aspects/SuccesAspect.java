package org.example.homework.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SuccesAspect {

    @After("execution(public void success(*))")
    public void afterSuccessAdvice (JoinPoint joinPoint) throws InterruptedException {
        System.out.println("банк успешно выполнил перевод средств!");

    }

}
