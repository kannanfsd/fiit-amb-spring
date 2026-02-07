package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring IoC Container
 */
@Configuration
public class ProjectConfig {
    @Bean(name = "honda")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean(value = "ferrari")
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

    @Bean("apple")
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }
}
