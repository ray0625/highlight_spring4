package com.jason.highlight_spring4.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by RenJian on 2017/7/6.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("form development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean ProdTestBean() {
        return new TestBean("from production profile");
    }
}
