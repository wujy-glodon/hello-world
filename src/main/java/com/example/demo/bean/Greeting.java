package com.example.demo.bean;

/**
 * Created by wujy on 2017/9/6.
 */
public class Greeting {

    private Long size;
    private String name;

    public Greeting(Long size, String name){
        this.size = size;
        this.name = name;
    }

    public Long getSize(){
        return this.size;
    }

    public String getName(){
        return this.name;
    }

    public void setSize(Long size){
        this.size = size;
    }

    public void setName(String name){
        this.name = name;
    }
}
