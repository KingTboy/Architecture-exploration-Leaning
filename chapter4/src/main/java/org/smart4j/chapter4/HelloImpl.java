package org.smart4j.chapter4;

/**
 * @description:
 * @author:shang
 * @date: Created in 2019/12/19 0019 9:31
 * @version: 1.0.0
 * @modified By:
 */
public class HelloImpl implements Hello {
    @Override
    public void sya(String name) {
        System.out.println("Hello "+name+" !");
    }
}
