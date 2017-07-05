package com.jason.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by RenJian on 2017/7/5.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demopublistener的消息" + msg);
    }
}
