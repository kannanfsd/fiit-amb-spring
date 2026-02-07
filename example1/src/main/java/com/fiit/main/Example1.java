package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("Vehicle name from non-spring context is "+vehicle.getName());
        /*
         the var keyword was introduced in Java 10. Type inference is used in var keyword in which it detects automatically the datatype of a variable
         based on the surrounding context.
         */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is "+veh.getName());

        var message = context.getBean(String.class);
        System.out.println("String value from spring context is "+message);

        var num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is "+num);

    }
}
