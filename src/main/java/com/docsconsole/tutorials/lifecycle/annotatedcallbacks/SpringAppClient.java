package com.docsconsole.tutorials.lifecycle.annotatedcallbacks;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        ASpringBean aSpringBean = context.getBean(ASpringBean.class);
        System.out.println(aSpringBean.getBSpringBean());

    }
}
