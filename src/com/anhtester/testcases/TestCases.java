package com.anhtester.testcases;

import com.anhtester.company.BaseTest;

import java.awt.*;

public class TestCases extends BaseTest {
    public void loginCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify redirect to admin page");
        closeDriver();
    }

    public void addCategoryCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify redirect to admin page");

        System.out.println("Click on the products menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click on the Add new Category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the save button");
        System.out.println("Verify add new category su");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.loginCMS();
        System.out.println("============");
        testCases.addCategoryCMS();
    }
}
