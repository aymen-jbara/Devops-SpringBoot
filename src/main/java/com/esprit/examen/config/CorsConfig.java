package com.esprit.examen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    private String url="http";
    private String url1="://";
    private String url2="192";
    private String url3=".";
    private String url4="168";
    private String url5="33";
    private String url6="166";
    private String url7=":4200";
    @Bean
    public WebMvcConfigurer getCorsConfiguration(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(url+url1+url2+url3+url4+url3+url5+url3+url6+url7)
                        .allowedMethods("*").allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
            }
        };
    }
}
