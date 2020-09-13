package com.mjie.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect1 {
	@Pointcut("execution(* *.test(..))")
	public void test() {
	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterReturning("test()")
	public void afterReturningTest() {
		System.out.println("after returningTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("after test");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint joinPoint) {
		System.out.println("before around");
		Object o = null;
		try {
			o = joinPoint.proceed();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		System.out.println("after around");
		return o;
	}
}
