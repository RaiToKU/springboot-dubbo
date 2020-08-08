package org.apache.dubbo.demo.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoService;

/**
 * @author raito
 * @date 2020/08/08
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}