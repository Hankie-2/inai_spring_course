package org.example.homework.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class TransferAspect {

    @Before("execution(public void transferInstantiate(*))")
    public void beforeTransferAdvice () throws InterruptedException {
        System.out.println("банк создает экземпляр сервиса перевода средств!");
     }

}
