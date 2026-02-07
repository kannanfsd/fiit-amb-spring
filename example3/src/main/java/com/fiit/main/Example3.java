package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        /*
         the var keyword was introduced in Java 10. Type inference is used in var keyword in which it detects automatically the datatype of a variable
         based on the surrounding context.
         */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh1 = context.getBean("honda", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+veh1.getName());

        var veh2 = context.getBean("ferrari", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+veh2.getName());

        var veh3 = context.getBean("apple", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+veh3.getName());


    }
}
