package com.jason.highlight_spring4.ch1.javaconfig;

import ch1.di.FunctionService;

/**
 * Created by RenJian on 2017/7/5.
 */
public class UserFunctionService {

    FunctionService functionService;

    public void setFunctionService (FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
