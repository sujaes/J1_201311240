package com.sd.headfirst.dao.v1;
public class Person {
    private int id;
    private String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
}
//저장을 해야하는 클래스를 VO라고함.