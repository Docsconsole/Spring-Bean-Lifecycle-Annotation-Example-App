package com.docsconsole.tutorials.lifecycle.annotatedcallbacks;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;
    private BSpringBean bSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
        System.out.println(":::::::<<<<<:::::::  constructor@ASpringBean    :::::::>>>>>>:::::::" + aSpringBeanName);
    }

    @PostConstruct
    public void aSpringBeanPostConstruct() {
        System.out.println(":::::::<<<<<:::::::  aSpringBeanPostConstruct() method  :::::::>>>>>>:::::::");
    }



    @Autowired
    public void setBSpringBean(BSpringBean bSpringBean) {
        System.out.println(":::::::<<<<<:::::::  setBSpringBean@ASpringBean    :::::::>>>>>>:::::::" + bSpringBean);
        this.bSpringBean = bSpringBean;
    }

    public void displayASpringBean() {
        System.out.println("ASpringBean@displayASpringBean()");
    }

    @PreDestroy
    public void aSpringBeanCleanUp() {
        System.out.println(":::::::<<<<<:::::::  aSpringBeanCleanUp() method   :::::::>>>>>>:::::::");
    }
}
