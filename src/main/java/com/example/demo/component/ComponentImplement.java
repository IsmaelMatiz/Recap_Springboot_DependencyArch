package com.example.demo.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void SayHi() {
        System.out.println("Say Hi BITCH!!!!!");
    }
}
