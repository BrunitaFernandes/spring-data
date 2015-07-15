package com.nixmash.springdata.jpa;

import com.nixmash.springdata.jpa.common.SpringUI;
import com.nixmash.springdata.jpa.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;

public class Launcher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
        System.out.println("version: " + SpringVersion.getVersion());
        SpringUI ui = ctx.getBean(SpringUI.class);
        ui.init();

    }

}
