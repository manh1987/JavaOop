package com.anhtester.tinhdahinh;

public class NapChong {

    public void clickElement(){
        System.out.println("Click Element");
    }
    public void clickElement(String xpath){
        System.out.println("Click Element"+ xpath);
    }

    public void clickElement(String xpath,int timeout){
        System.out.println("Click Element"+ xpath + "with" + timeout);
    }

    public static void main(String[] args) {
        NapChong napChong = new NapChong();
        napChong.clickElement("//button",20);
    }
}
