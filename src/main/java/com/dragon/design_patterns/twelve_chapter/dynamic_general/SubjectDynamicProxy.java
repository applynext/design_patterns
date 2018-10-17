package com.dragon.design_patterns.twelve_chapter.dynamic_general;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler h = new MyInvocationHandler(subject);
        return newProxyInstance(loader,interfaces,h);
    }
}
