package com.docsconsole.tutorials.lifecycle.beanawares;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        ASpringBean ASpringBean = context.getBean(ASpringBean.class);
        System.out.println("After Creation of "+ASpringBean.getASpringBeanName());

    }
}
