package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    
    // tutaj dodajemy nasze related advices
    
    // let's start with an @Before advice
    @Before("execution(* add*(..))")
    public void beforeAddAccountAdvice() {
        
        System.out.println("\n========>>> Executing @Before advice on method");
    }
    
}
