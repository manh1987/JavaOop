package com.anhtester.tinhtruutuong;

public class SinhVien extends Person {
    @Override
    public void showInfo() {
        System.out.println("Nguyễn Văn A " );
    }
    //Cho biết hàm này buộc phải ghi đè giống với tên hàm ở class Person

    @Override
    public void getCNND() {

    }
}
