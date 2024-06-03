package com.anhtester.company;

public class BaseTest {
    public void createDriver(){
        System.out.println("Close Browser "+Constants.browser);
        System.out.println(Constants.report);
        System.out.println(Constants.headless);

    }

    public void closeDriver(){
        System.out.println("Closed browser"+ Constants.browser);
    }

    public void closeDriver(String browser){
        System.out.println("Closed browser"+ Constants.browser);
    }

}
