/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi15032023;


import  java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        for ( int i= 1; i <=angka; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("y");
            } else if ( i% 3 == 0){
                System.out.println("g");
        }else{
                System.out.println("n");
            }
            
        }
    }
    
}
