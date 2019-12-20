package org.smart4j.chapter4.srping;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author:shang
 * @date: Created in 2019/12/19 0019 14:20
 * @version: 1.0.0
 * @modified By:
 */
public class GreetingBeforeAdivece implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before");
    }


}
