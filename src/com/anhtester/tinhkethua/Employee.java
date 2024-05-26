package com.anhtester.tinhkethua;

public class Employee extends  Person{

    private String address;

    public Employee(String name, int age, float height, String address){
        super(name, age, height);
        this.address = address;
    }
    //Ghi đè phương thức từ class cha
//    @Override
//    public void getInfo(){
//        super.getInfo();
//        Object employee;
//        System.out.println("Address"+ employee.address);
//    }
    public static void main(String[] args) {
        Employee employee = new Employee("An",30,78,"Ha Noi");
        employee.getInfo();
//        System.out.println("Address"+ employee.address);
    }
}
