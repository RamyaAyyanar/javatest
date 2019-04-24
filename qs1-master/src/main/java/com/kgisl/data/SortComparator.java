package com.kgisl.data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SortComparator
 */
public class SortComparator {

    public static void main(String[] args) {       
                     

      List<EmployeeConstructor> l=Arrays.asList(new EmployeeConstructor(12,"Saran",1440),
                           new EmployeeConstructor(32,"Kalai",5500),
                           new EmployeeConstructor(52,"Arun",1100),
                           new EmployeeConstructor(22,"Suganya",2300));
                           System.out.println("Employee List:"+l);


List<EmployeeConstructor> sortId=l.stream().sorted(Comparator.comparing(EmployeeConstructor::getEmpid)).collect(Collectors.toList());
System.out.println("\nSorted by EmpId:");
sortId.forEach(System.out::print);
List<EmployeeConstructor> sortName=l.stream().sorted(Comparator.comparing(EmployeeConstructor::getName)).collect(Collectors.toList());
System.out.println("\nSorted by Name:");
sortName.forEach(System.out::print);
List<EmployeeConstructor> sortSalary=l.stream().sorted(Comparator.comparing(EmployeeConstructor::getSalary)).collect(Collectors.toList());
System.out.println("\nSorted by Salary:");
sortSalary.forEach(System.out::print);
    }
}