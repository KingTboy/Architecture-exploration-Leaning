package org.smart4j.chapter4.srping;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:shang
 * @date: Created in 2019/12/19 0019 14:29
 * @version: 1.0.0
 * @modified By:
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After");
    }

}
