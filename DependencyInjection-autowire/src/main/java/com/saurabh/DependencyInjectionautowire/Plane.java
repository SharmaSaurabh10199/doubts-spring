package com.saurabh.DependencyInjectionautowire;

import org.springframework.stereotype.Component;

@Component
public class Plane {
    public void fly() {
        System.out.println("flying high");
    }
}
