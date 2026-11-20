package org.example.activity124;

// 1) Create Person class (It should be abstract class)

public abstract class Person {

    // 1.1) Create attributes in Person class: name, age

    private String name;
    private int age;

    // 1.2) Create setters and getters for attributes

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 1.3) Define introduce method

    public abstract void introduce();

}




