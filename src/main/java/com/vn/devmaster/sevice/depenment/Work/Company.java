package com.vn.devmaster.sevice.depenment.Work;

import org.springframework.stereotype.Component;

@Component("company")
public class Company implements Person{
    @Override
    public void wear() {
        System.out.println("In wear by Company");
    }

    @Override
    public void work() {
        System.out.println("In work by company");
    }
}
