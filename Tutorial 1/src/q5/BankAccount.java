/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author haika
 */
public class BankAccount implements Account {
    private int balance;

    BankAccount(int balance) {
    this.balance = balance;
                             }

 public int deposit(int depositAmount) {
    return balance = balance + depositAmount;
                                       }
                                        
 public boolean withdraw(int widthdrawAmount) {
    if(widthdrawAmount < balance) {
        balance = balance - widthdrawAmount;
            return true;
                                  }
        else
            return false;
                                              }
}
