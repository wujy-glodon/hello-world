package com.example.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Created by wujy on 2017/9/6.
 */
public class JacksonDemo {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person();
        person.username = "xxx";
        person.password = "123";

        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);


    }

    static class Person {
        public String username;
        public String password;
    }
}
