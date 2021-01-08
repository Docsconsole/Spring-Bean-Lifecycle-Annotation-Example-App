/**
 *
 */
package com.docsconsole.tutorials.lifecycle.initdestcallbacks;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConfig {

    @Bean
    public ASpringBean aSpringBean() {
        return new ASpringBean("A ASpringBean Bean");
    }
}
