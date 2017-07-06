package com.jason.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by RenJian on 2017/7/6.
 */
public class LinuxCondition implements Condition{
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Linux");
    }
}
