package org.example;

import java.util.Random;

public class Employee {
    private String name;
    private int tabNumber;
    private int experienceMonth;
    private String phone;

    Employee(String name, String phone){
        this.name=name;
        this.phone=phone;
        Random rnd = new Random();
        this.experienceMonth = rnd.nextInt(121);
        this.tabNumber = rnd.nextInt(100000,110000);
    }
    Employee(String name, String phone, int experienceMonth, int tabNumber){
        this.name=name;
        this.phone=phone;
        this.experienceMonth = experienceMonth;
        this.tabNumber = tabNumber;
    }

    public String getName() {
        return name;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public int getExperienceMonth() {
        return experienceMonth;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", tabNumber=" + tabNumber +
                ", experienceMonth=" + experienceMonth +
                ", phone='" + phone + '\'' +
                '}';
    }
}
