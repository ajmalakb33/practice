package com.ajmal;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

    public static void main(String args[]) {
        Employee employee1 = new Employee();
        employee1.setAge(20);
        employee1.setName("20");
        Employee employee2 = new Employee();
        employee2.setAge(15);
        employee2.setName("15");
        Employee employee3 = new Employee();
        employee3.setAge(20);
        employee3.setName("20");
        Employee employee4 = new Employee();
        employee4.setAge(21);
        employee4.setName("21");
        Employee employee5 = new Employee();
        employee5.setAge(17);
        employee5.setName("17");
        Employee employee6 = new Employee();
        employee6.setAge(16);
        employee6.setName("17");
        Employee employee7 = new Employee();
        employee7.setAge(23);
        employee7.setName("23");
        Employee employee8 = new Employee();
        employee8.setAge(25);
        employee8.setName("25");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        System.out.println(employee1.getListOfAges(employees));
        System.out.println(employee1.getUniqueNames(employees));

    }

}
