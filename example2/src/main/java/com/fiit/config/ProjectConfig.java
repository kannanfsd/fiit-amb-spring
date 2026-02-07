package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring IoC Container
 */
@Configuration
public class ProjectConfig {
    /*
    @Bean annotation, which lets spring know that it needs to call this method when it initializes its context and
    adds the returned value to the context.
     */
    @Bean
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }
    /*
    the method name usally follow verbs notation. but for methods which we will use to creates beans, can use nouns as names.
    This will be a good practise as the method names will become bean names as well in the context.
     */
}
