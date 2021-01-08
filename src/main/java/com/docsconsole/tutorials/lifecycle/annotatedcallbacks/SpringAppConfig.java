/**
 *
 */
package com.docsconsole.tutorials.lifecycle.annotatedcallbacks;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("ASpringBean");
    }

    @Bean
    public BSpringBean bSpringBean() {
        return new BSpringBean("ASpringBean");
    }

}
