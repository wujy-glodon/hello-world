package com.example.demo.util;

import io.restassured.RestAssured;
/**
 * Created by wujy on 2017/9/6.
 */
public class RestAssuredDemo {

    public static void main(String[] args) {
        RestAssured.baseURI = "http://bimface.com";
        RestAssured.basePath = "/console";
    }
}
