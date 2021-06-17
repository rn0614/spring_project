package com.multi.exercise;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/fileresources/**")
                .addResourceLocations("file:///C:/springWorkspace/exerciseManagerFinal/src/main/webapp/fileresources/");
    }
}


