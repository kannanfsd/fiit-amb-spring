package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        /*
         the var keyword was introduced in Java 10. Type inference is used in var keyword in which it detects automatically the datatype of a variable
         based on the surrounding context.
         */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //var veh = context.getBean(Vehicle.class);
        var veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+veh.getName());

    }
}
