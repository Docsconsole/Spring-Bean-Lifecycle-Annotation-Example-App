/**
 *
 */
package com.docsconsole.tutorials.lifecycle.definitdestmethods;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean(initMethod = "aSpringBeanPostConstruct", destroyMethod = "aSpringBeanCleanUp")
    public ASpringBean aSpringBean() {
        return new ASpringBean("ASpringBean");
    }

    @Bean
    public BSpringBean bSpringBean() {
        return new BSpringBean("BSpringBean");
    }

}
