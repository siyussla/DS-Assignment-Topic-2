/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author haika
 */
class Person {
public Person() {

    System.out.println("(1) Performs Person's tasks");
    
 }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
                      }
 public Employee(String s) {
 System.out.println(s);
 }
}


