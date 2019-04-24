package com.kgisl.data;

/**
 * EmployeeConstructor
 */
public class EmployeeConstructor {
    int empid;
    String name;
    float salary;

    EmployeeConstructor() {
        System.out.println("Constructor");
    }

    EmployeeConstructor(int empid, String name, float salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
/**
 * @return the empid
 */
public int getEmpid() {
    return empid;
}/**
 * @param empid the empid to set
 */
public void setEmpid(int empid) {
    this.empid = empid;
}/**
 * @return the name
 */
public String getName() {
    return name;
}/**
 * @param name the name to set
 */
public void setName(String name) {
    this.name = name;
}/**
 * @return the salary
 */
public float getSalary() {
    return salary;
}/**
 * @param salary the salary to set
 */
public void setSalary(float salary) {
    this.salary = salary;
}@Override
public String toString() {
    return "\nEmp ID:"+empid+"\tName: "+name+"\tSalary: "+salary;
}
}