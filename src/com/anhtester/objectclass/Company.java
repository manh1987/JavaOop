package com.anhtester.objectclass;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {

    //Khởi tạo đối tượng class SinhVien
    SinhVien sv1 = new SinhVien("Vân Anh",40,"HN","Auto test");
    sv1.printInfo();

    SinhVien sv2 = new SinhVien("Diệu",35,"HN","Auto test");
    sv2.printInfo();

        SinhVien sv3 = new SinhVien("Huyền",30,"HN","Auto test");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Selenium");
        arrayList.add("Auto");

        ArrayList<SinhVien> listsinhVien = new ArrayList<>();
        listsinhVien.add(sv1); //Thêm bộ data sv1 vào vị trí đầu tien trong ArrayList
        listsinhVien.add(sv2);
        listsinhVien.add(sv3);

        for (SinhVien sv : listsinhVien){
            System.out.println("===========");
            sv.printInfo();
        }

    }
}
