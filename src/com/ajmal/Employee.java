package com.ajmal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
    private Integer id;
    private Integer age;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getListOfAges(List<Employee> employees) {
        return employees
                .stream()
                .filter(x -> x.getAge() > 18)
                .map(Employee::getAge)
                .collect(Collectors.toList());
    }

    public List<String> getUniqueNames(List<Employee> employees) {
        Set<String> uniqueNames = employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        return new ArrayList<>(uniqueNames);
    }
}
