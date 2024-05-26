package com.anhtester.tinhkethua;

public class Student  extends  Person{
    public Student(String name,int age,float height){
        super(name,age,height);
    }

    public  void laythongtin(){
        getInfo();
    }

    public static void main(String[] args) {
        Student student = new Student("Phuong",30,50);
        student.getInfo();
    }
}
