package com.mkyong.editor;

import javax.inject.Inject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named(value = "controller")
public class MyController {
    @Inject
    MyService service;

    public String hello() {
        return service.hello();
    }
}
