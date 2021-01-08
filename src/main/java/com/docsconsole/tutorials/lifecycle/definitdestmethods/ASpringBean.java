package com.docsconsole.tutorials.lifecycle.definitdestmethods;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class ASpringBean {

    private String aSpringBeanName;
    private BSpringBean bSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
        System.out.println(":::::::<<<<<:::::::  constructor@ASpringBean    :::::::>>>>>>:::::::" + aSpringBeanName);
    }

    public void aSpringBeanPostConstruct() {
        System.out.println(":::::::<<<<<:::::::  aSpringBeanPostConstruct()@ASpringBean    :::::::>>>>>>:::::::" + bSpringBean);
    }

    @Autowired
    public void setBSpringBean(BSpringBean bSpringBean) {
        System.out.println(":::::::<<<<<:::::::  setBSpringBean@ASpringBean    :::::::>>>>>>:::::::" + bSpringBean);
        this.bSpringBean = bSpringBean;
    }

    public void displayASpringBean() {
        System.out.println("ASpringBean@displayASpringBean()");
    }

    public void aSpringBeanCleanUp() {
        System.out.println(":::::::<<<<<:::::::  aSpringBeanCleanUp method@ASpringBean    :::::::>>>>>>:::::::" + bSpringBean);
    }
}
