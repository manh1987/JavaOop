package com.anhtester.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("0936366649","Manh",30,"MR","Hà Nội");
        Person person2 = new Person("0936366649","Manh",30,"MR","Hà Nội");
        person1.getInfo();
        System.out.println("=============");
        person2.getInfo();

        }
}
