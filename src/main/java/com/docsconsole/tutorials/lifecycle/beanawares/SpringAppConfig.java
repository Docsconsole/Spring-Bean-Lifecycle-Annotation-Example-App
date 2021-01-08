/**
 *
 */
package com.docsconsole.tutorials.lifecycle.beanawares;


import com.docsconsole.tutorials.lifecycle.definitdestmethods.BSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("A ASpringBean Bean");
    }

    @Bean
    public BSpringBean bSpringBean() {
        return new BSpringBean("BSpringBean");
    }
}
