/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project8;

/**
 *
 * @author asus
 */
public class TestBank {
    public static void main(String[] args) {
        Account a2 = new Account();
        Account a3 = new Account();
        a2.setAccountName("Khozi");
        a2.setAccountNum(2101091006);
        a2.setBalance(50000);
        
        a3.setAccountName("Natul");
        a3.setAccountNum(2101091000);
        a3.setBalance(100000);
    
        a2.print();
        System.out.println("");
        a3.print();
    }
    
    
}
