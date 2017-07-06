package com.jason.highlight_spring4.ch3.fortest;

import org.junit.Test;

/**
 * Created by RenJian on 2017/7/6.
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
