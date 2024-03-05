package com.vn.devmaster.sevice.depenment.depemtent;

import org.springframework.stereotype.Component;

@Component("boy")
public class Boy implements Person {
    @Override
    public void wear(){
        System.out.println("boy wear dess");
    }
}
