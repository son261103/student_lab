package com.vn.devmaster.sevice.depenment.depemtent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employe {
    @Qualifier("boy")
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }
}

