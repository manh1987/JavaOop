package com.anhtester.person;

public class Person {
    private String name1 = "Mạnh";
    private int age = 30;
    private String gender = "Mr";
    private String address = "Ha Noi";
    private String phone = "0936366649";

    public Person(String phone, String name1, int age, String gender, String address) {
        this.phone = phone;
        this.name1 = name1;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void getInfo(){
        System.out.println("Name :" + getName());
        System.out.println("Name :" + getAge());
        System.out.println("Name :" + getGender());
        System.out.println("Name :" + getAddress());
        System.out.println("Name :" + getPhone());
    }

    public String getName () {
        return name1;
    }
    public  int getAge(){
        return age;
    }
    public  String getGender() {
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return  phone;
    }
}
