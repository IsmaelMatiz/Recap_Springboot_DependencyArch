package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void SayHi() {
        System.out.println("Hello There, its mee");
    }
}
