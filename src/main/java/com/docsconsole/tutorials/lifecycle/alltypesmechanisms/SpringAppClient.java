package com.docsconsole.tutorials.lifecycle.alltypesmechanisms;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppClient {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        ASpringBean ASpringBean = context.getBean(com.docsconsole.tutorials.lifecycle.alltypesmechanisms.ASpringBean.class);

        System.out.println(":::::::<<<<<:::::::  After Creation of    :::::::>>>>>>:::::::" + ASpringBean.getASpringBeanName());
        context.registerShutdownHook();
        System.out.println(":::::::<<<<<:::::::  After registerShutdownHook   :::::::>>>>>>:::::::" );
    }
}
