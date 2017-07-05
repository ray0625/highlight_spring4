package com.jason.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by RenJian on 2017/7/5.
 */
@Configuration
@ComponentScan("com.jason.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy//spring 对aspectj的支持
public class AopConfig {
}
