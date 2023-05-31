/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        int Balance = 100000;
        
        Account a2 = new Account();
        a2.setAccountName("Khozi");
        a2.setAccountNum(123459876);
        
        
        System.out.println("=== Menu ATM ===");
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Deposit");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Keluar");
        
        System.out.print("Pilihan : ");
        int pilih = input.nextInt();
        
        //Switch case
          switch(pilih){
            
            case 1 :
            
            System.out.print("Masukkan jumlah yang ingin ditarik: ");
            int Tarik = input.nextInt();
            if(Tarik > Balance) {
               System.out.println("Maaf, saldo Anda tidak mencukupi");
            } else {
               Balance -= Tarik;
               System.out.println("Sisa saldo Anda: " + Balance);
            }
            break;
                       
            case 2 :
            System.out.print("Masukkan jumlah yang ingin dideposit: ");                       
            int Deposit = input.nextInt();
            Balance += Deposit;
            System.out.println("Saldo Anda: " + Balance);
            break;
            
            case 3 :            
            System.out.println("Saldo Anda: " + Balance);
            a2.setBalance(50000);
            a2.print();
            break;
            
            default : System.out.println("Input Error");
        
    }
}
}