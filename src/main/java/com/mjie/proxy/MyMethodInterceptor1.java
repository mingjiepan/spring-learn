package com.mjie.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor1 implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before myMethodInterceptor1");
        invocation.proceed();
        System.out.println("after myMethodInterceptor1");
        return null;
    }
}
