package com.jason.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by RenJian on 2017/7/5.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截add操作")
    public void add(){

    }
}
