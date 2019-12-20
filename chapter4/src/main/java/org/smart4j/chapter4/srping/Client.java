package org.smart4j.chapter4.srping;

import org.smart4j.chapter4.Hello;
import org.smart4j.chapter4.HelloImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @description:
 * @author:shang
 * @date: Created in 2019/12/19 0019 14:35
 * @version: 1.0.0
 * @modified By:
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new HelloImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdivece());
        proxyFactory.addAdvice(new GreetingAfterAdvice());

        Hello hello = (Hello) proxyFactory.getProxy();
        hello.sya("Json");

    }
}
