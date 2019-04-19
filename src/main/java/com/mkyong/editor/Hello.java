package com.mkyong.editor;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Named(value="beppe")
public class Hello {
    String name = "Pierre";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
