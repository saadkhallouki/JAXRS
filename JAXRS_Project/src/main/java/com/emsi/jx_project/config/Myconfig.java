package com.emsi.jx_project.config;

import com.emsi.jx_project.service.CompteRestJaxRSAPI; // Import your REST service
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class); // Register the correct resource
        return jerseyServlet;
    }
}
