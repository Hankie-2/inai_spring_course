package org.example.homework;


import org.springframework.stereotype.Component;

@Component("auditing")
public class Auditing {

    public void validate(String name){
        System.out.println("банк проверил ваши учетные данные до перевода средств");
        System.out.println();
    }

    public void transferInstantiate(){
        System.out.println("банк создал экземпляр сервиса перевода средств");
        System.out.println();
    }

    public void success(){
        System.out.println("попытка выполнения перевода средств");
    }

    public void rollback(){
        System.out.println();
        System.out.println("попытка отката перевода средств");
    }

}
