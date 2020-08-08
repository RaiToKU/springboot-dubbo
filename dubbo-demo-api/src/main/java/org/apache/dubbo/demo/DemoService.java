package org.apache.dubbo.demo;

/**
 * @author raito
 * @date 2020/08/08
 */
public interface DemoService {

    /**
     * hello world dubbo
     *
     * @param name String
     * @return String
     */
    String sayHello(String name);
}
