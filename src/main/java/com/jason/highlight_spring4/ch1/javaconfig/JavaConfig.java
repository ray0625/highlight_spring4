package com.jason.highlight_spring4.ch1.javaconfig;

import ch1.di.FunctionService;
import org.springframework.context.annotation.Bean;

/**
 * Created by RenJian on 2017/7/5.
 */
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService () {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }

//    @Bean
//    public  UserFunctionService userFunctionService(FunctionService functionService) {
//        UserFunctionService userFunctionService = new UserFunctionService();
//        userFunctionService.setFunctionService(functionService);
//        return userFunctionService
//    }
}
