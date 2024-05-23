package com.anhtester.thongtin;

import phamvitruycap.student;
//lơp ThongTin kế thừa lớp student
public class ThongTin extends student{
    public void getInfo(){
        System.out.println(getname());
        System.out.println(getCCCD());
    }
    public static void main(String[] args) {
        student student = new student();

    }
}
