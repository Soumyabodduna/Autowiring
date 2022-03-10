package com.dxc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
//neither constructor nor setter method is used to inject the dependency
    @Autowired
   // @Qualifier("dept")
    //type        //name
    Dept        dept;//reference varaible


 //   @Autowired
 //   public Company(@Qualifier("dept1") HRDept dept) {//constructor//(@Qualifier("dept1") HRDept dept)
    //   this.dept = dept;
     //   System.out.println("constructor");
  //  }
  //  @Autowired
   // public void setDept(@Qualifier("dept1")ITDept dept) {
    //    this.dept = dept;
     //   System.out.println("setter");
 //  }

    public void companyWork(){//method
        dept.work();
    }
}
