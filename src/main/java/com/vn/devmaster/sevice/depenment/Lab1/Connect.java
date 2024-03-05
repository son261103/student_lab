package com.vn.devmaster.sevice.depenment.Lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Connect {
//    @Qualifier("mysql")
    @Autowired
    private ISql sqlserver;

    public ISql getSql() {
        return sqlserver;
    }

}
