package org.example.homework.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(40)
public class ExceptionAspect {

    @After("execution(public void rollback(*))")
    public void afterRollbackAdvice () throws InterruptedException {
        System.out.println("банк откатил операцию перевода средств!");

    }

}
