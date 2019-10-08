/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class ContohSwitchCase {
    public static void main(String[] args) {
        int nomor = 2;
        
        switch(nomor){
            case 1:
                System.out.println("Kamu pilih satu");
                break;
            case 2:
                System.out.println("Kamu pilih dua");
                break;
            case 3:
                System.out.println("Kamu pilih tiga");
                break;
            default:
                System.out.println("Kamu pilih angka selain 1, 2, dan 3");
        }
    }
}
