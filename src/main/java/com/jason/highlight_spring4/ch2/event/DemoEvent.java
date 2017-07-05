package com.jason.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by RenJian on 2017/7/5.
 */
public class DemoEvent extends ApplicationEvent{
    private static  final long servialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public static long getServialVersionUID() {
        return servialVersionUID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
