package com.vn.devmaster.sevice.depenment;

import com.vn.devmaster.sevice.depenment.Lab1.Connect;
import com.vn.devmaster.sevice.depenment.Work.Student;
import com.vn.devmaster.sevice.depenment.depemtent.Employe;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DepenmentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DepenmentApplication.class, args);
//        Employe employe = context.getBean(Employe.class);
//        employe.getPerson().wear();
//        Connect connect = context.getBean(Connect.class);
//        connect.getSql().connect();
        Student student = context.getBean(Student.class);
        student.getPerson().work();
//        student.getPerson().work();
    }
//    ConfigurableApplicationContext context

}
