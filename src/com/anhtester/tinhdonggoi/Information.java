package com.anhtester.tinhdonggoi;

public class Information {

    public  void TC01(){
        Student student = new Student("Phuc", "Ha Noi",30);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }

    public void TC02(){
        Student student = new Student("Huong", "Da Nang",28);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());

    }
    public static void main(String[] args) {
        Student student = new Student("Phuc", "Ha Noi",30 );
        System.out.println(student.getName());
        student.setName("Hân");
        System.out.println(student.getName());
        Information information = new Information();
        information.TC01();
        information.TC02();

    }
}
