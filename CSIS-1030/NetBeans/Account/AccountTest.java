/*
Project: <Mk2 Wk5 Assignment>;
File: <Account>;
Name: <Bradford Anderson>;
Date: <6/15/2018>
 */
package account;

/**
 *
 * @author B-rad19
 */
public class AccountTest {
    public static void main(String[] args) {
      Account account1 = new Account (1000);
      System.out.println("Account1 starting balance: " + account1.getBalance());
      account1.credit(50);
      System.out.println("Account1 current credit balance: " + account1.getBalance());
      account1.debit(100);
      System.out.println("Account1 current debit balance: " + account1.getBalance());

      Account account2 = new Account(500);
      System.out.println("Account2 starting balance: " + account2.getBalance());
      account2.credit(50);
      System.out.println("Account2 current credit balance: " + account2.getBalance());
      account2.debit(100);
      System.out.println("Account2 current debit balance: " + account2.getBalance());
    }
}
