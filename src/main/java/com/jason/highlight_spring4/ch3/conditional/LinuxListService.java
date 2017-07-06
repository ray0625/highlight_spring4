package com.jason.highlight_spring4.ch3.conditional;

/**
 * Created by RenJian on 2017/7/6.
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "linux";
    }
}
