package com.docsconsole.tutorials.lifecycle.beanawares;


import com.docsconsole.tutorials.lifecycle.definitdestmethods.BSpringBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

@Getter
@Setter
public class ASpringBean implements ApplicationContextAware,
        ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
        BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
        NotificationPublisherAware, ResourceLoaderAware {

    private String aSpringBeanName;
    private BSpringBean bSpringBean;

    public ASpringBean(String aSpringBeanName) {
        this.aSpringBeanName = aSpringBeanName;
        System.out.println(":::::::<<<<<:::::::  constructor@ASpringBean    :::::::>>>>>>:::::::" + aSpringBeanName);
    }

    @Autowired
    public void setBSpringBean(BSpringBean bSpringBean) {
        System.out.println(":::::::<<<<<:::::::  setBSpringBean@ASpringBean    :::::::>>>>>>:::::::" + bSpringBean);
        this.bSpringBean = bSpringBean;
    }

    @Override
    public void setResourceLoader(ResourceLoader arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setResourceLoader@ResourceLoaderAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setNotificationPublisher(NotificationPublisher arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setNotificationPublisher@NotificationPublisherAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setMessageSource(MessageSource arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setMessageSource@MessageSourceAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setLoadTimeWeaver@LoadTimeWeaverAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setBeanName(String arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setBeanName@BeanNameAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setBeanFactory@BeanFactoryAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setBeanClassLoader(ClassLoader arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setBeanClassLoader@BeanClassLoaderAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setApplicationEventPublisher@ApplicationEventPublisherAware    :::::::>>>>>>:::::::");
    }

    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        // TODO Auto-generated method stub
        System.out.println(":::::::<<<<<:::::::  setApplicationContext@ApplicationContextAware    :::::::>>>>>>:::::::");
    }
}
