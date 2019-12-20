package org.smart4j.chapter4.jdbc;

import org.smart4j.chapter4.Hello;
import org.smart4j.chapter4.HelloImpl;

/**
 * @description：静态代理
 * @author:shang
 * @date: Created in 2019/12/19 0019 9:32
 * @version: 1.0.0
 * @modified By:
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy() {
         hello = new HelloImpl();
    }

    @Override
    public void sya(String name) {
        before();
        hello.sya(name);
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");;
    }

    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.sya("Json");
    }
}
