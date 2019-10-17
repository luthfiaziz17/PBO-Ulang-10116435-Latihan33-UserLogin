/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          User signin = new User();
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        String user = scnr.next();
        System.out.print("Masukkan Password = ");
        String pass = scnr.next();
        System.out.println();
        
        signin.pengecekanLogin(user,pass);
    }
    
}
