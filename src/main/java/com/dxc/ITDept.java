package com.dxc;

import org.springframework.context.annotation.Primary;


public class ITDept implements Dept {
    public void work(){
        System.out.println("Software Development");
    }

}
