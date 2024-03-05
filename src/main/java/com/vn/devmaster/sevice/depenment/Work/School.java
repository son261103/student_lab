package com.vn.devmaster.sevice.depenment.Work;

import org.springframework.stereotype.Component;

@Component("school")
public class School implements Person{
    @Override
    public void wear() {
        System.out.println("In wear by school");
    }

    @Override
    public void work() {
        System.out.println("In Word by school");
    }
}
