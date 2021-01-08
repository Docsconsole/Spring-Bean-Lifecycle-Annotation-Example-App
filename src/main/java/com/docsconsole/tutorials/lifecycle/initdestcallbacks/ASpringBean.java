package com.docsconsole.tutorials.lifecycle.initdestcallbacks;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter
@Setter
public class ASpringBean implements InitializingBean, DisposableBean {

    private String aSpringBeanName;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
        System.out.println(":::::::<<<<<:::::::  constructor@ASpringBean    :::::::>>>>>>:::::::" + aSpringBeanName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(":::::::<<<<<:::::::  afterPropertiesSet()@InitializingBean    :::::::>>>>>>:::::::");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(":::::::<<<<<:::::::  destroy()@DisposableBean    :::::::>>>>>>:::::::");
    }
}
