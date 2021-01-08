package com.docsconsole.tutorials.lifecycle.annotatedcallbacks;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BSpringBean {

    private String bSpringBeanName;

    public BSpringBean(String bSpringBeanName) {
        this.bSpringBeanName = bSpringBeanName;
        System.out.println(":::::::<<<<<:::::::  constructor@BSpringBean    :::::::>>>>>>:::::::" + bSpringBeanName);
    }

}
