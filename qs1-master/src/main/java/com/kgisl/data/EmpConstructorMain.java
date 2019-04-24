package com.kgisl.data;

/**
 * EmpConstructorMain
 */
public class EmpConstructorMain {

    public static void main(String[] args) {
        EmployeeConstructor ob=new EmployeeConstructor();
        ob.setEmpid(22);
        ob.setName("Raji");
        ob.setSalary(1222);
        System.out.println("Employee details:"+ob.getEmpid()+" ,"+ob.getName()+", "+ob.getSalary());
        EmployeeConstructor ob1=new EmployeeConstructor(12,"Saran",1300);
      //  EmployeeConstructor ob2=new EmployeeConstructor(13,"Jaya",3100);
System.out.println("Employee:"+ob1.toString());
    }
}