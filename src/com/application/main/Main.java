package com.application.main;

import com.application.model.ExamResult;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ExamResult examResult = context.getBean("examinationresult",ExamResult.class);
        System.out.println(examResult.getResultMessage());
        System.out.println(examResult.isHasPassed());
        context.close();
    }
}
