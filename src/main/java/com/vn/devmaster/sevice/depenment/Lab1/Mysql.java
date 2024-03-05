package com.vn.devmaster.sevice.depenment.Lab1;

import org.springframework.stereotype.Component;

@Component("mysql")
public class Mysql implements ISql{
    @Override
    public void connect(){
        System.out.println("My sql!");
    }
}
