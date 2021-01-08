package com.docsconsole.tutorials.lifecycle.initdestcallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppClient {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        ASpringBean ASpringBean = context.getBean(com.docsconsole.tutorials.lifecycle.initdestcallbacks.ASpringBean.class);
        System.out.println(ASpringBean.getASpringBeanName());
        context.registerShutdownHook();

    }
}
