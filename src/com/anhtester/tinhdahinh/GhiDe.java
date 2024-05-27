package com.anhtester.tinhdahinh;

public class GhiDe extends ActionKeyword{

    @Override
    public void clickElement() {
        System.out.println("Click on element from Child class");
           }

    public void setText(String text){
        System.out.println("Set text from ");
    }

    public static void main(String[] args) {
        GhiDe ghiDe = new GhiDe();
        ghiDe.clickElement();
        ghiDe.setText("Selenium");
        ghiDe.scrollToElement();

    }
}
