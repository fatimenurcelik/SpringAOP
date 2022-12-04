package com.celik.springAOP.business.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
	
		@Before("execution(* com.celik.springAOP.business.abstracts.*.*(..))")
	    public void beforeGetAllMethod(JoinPoint joinPoint) {
	        System.out.println("logged before getAll method");
	        System.out.println(joinPoint.getSignature());
	    }

	    @After("execution(* com.celik.springAOP.business.abstracts.*.*(..))")
	    public void afterGetAllMethod(JoinPoint joinPoint) {
	        System.out.println("logged after getAll method");
	        System.out.println(joinPoint.getSignature());
	    }
}
