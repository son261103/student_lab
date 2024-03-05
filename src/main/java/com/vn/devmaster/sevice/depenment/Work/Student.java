package com.vn.devmaster.sevice.depenment.Work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student  {
    @Qualifier("school")
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }
}
