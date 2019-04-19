package com.mkyong.editor;

import javax.ejb.Stateless;

@Stateless
public class MyService {
    public String hello() {
        return "hello Marx";
    }
}
