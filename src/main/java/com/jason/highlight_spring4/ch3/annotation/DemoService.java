package com.jason.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by RenJian on 2017/7/6.
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("组合注解配置得到bean");
    }
}
