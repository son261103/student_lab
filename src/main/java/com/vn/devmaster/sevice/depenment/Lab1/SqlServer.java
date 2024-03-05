package com.vn.devmaster.sevice.depenment.Lab1;

import org.springframework.stereotype.Component;

@Component("sqlserver")
public class SqlServer implements ISql{
    @Override
    public void connect(){
        System.out.println("Sql Server");
    }
}
