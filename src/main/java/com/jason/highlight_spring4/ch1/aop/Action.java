package com.jason.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by RenJian on 2017/7/5.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
