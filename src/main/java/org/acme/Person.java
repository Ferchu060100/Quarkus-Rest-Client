package org.acme;
import io.quarkus.runtime.annotations.RegisterForReflection;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int id;
    private String name;
    private String surname;
    private int age;
    public Person(){

    }
    public Person(int id,String name,String surname,int age){
        this.id=id;
        this.name= name;
        this.surname=surname;
        this.age=age;
    }
    public Person(String name,String surname,int age){
        this.name= name;
        this.surname=surname;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
