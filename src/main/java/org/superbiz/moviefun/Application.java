package org.superbiz.moviefun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean moviefun(ActionServlet aServlet){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(aServlet);
        servletRegistrationBean.addUrlMappings("/moviefun/*");
        return servletRegistrationBean;
    }
}
