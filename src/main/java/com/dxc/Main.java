package com.dxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans1.xml");
        Company company = ac.getBean("company",Company.class);
        company.companyWork();
    }
}
