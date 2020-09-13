package com.mjie.config;

import com.mjie.beans.MyTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "myTestBean")
    public MyTestBean myTestBean() {
        return new MyTestBean();
    }
}
