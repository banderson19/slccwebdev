/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author B-rad19
 */
public class Account {
    
    private int balance;
    
    Account(int balance) {
        this.balance = balance;
    }
    
    void credit(int amount) {
        balance = balance + amount;
    }

    void debit(int amount) {
        balance = balance - amount;
    }
    
    int getBalance () {
        return balance;
    }
}
