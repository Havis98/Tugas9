/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;

/**
 *
 * @author havis
 */
import java.util.Scanner;
public class Tugas9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x,y;
        Scanner masukan= new Scanner(System.in);
            
        
        kalkulatorBeras itung= new kalkulatorBeras();
        
        System.out.println("1. kali\n"+"2. bagi\n"+"3. tambah\n"+"4. kurang\n"+"5. advance kalkulator\n");
        try{
        int pil;
            System.out.print("Pilih = ");
        pil=masukan.nextInt();
        switch(pil){
            case 1:
                System.out.print("Masukkan nilai X= ");
                x= masukan.nextDouble();
                System.out.print("Masukkan nilai Y=");
                y= masukan.nextDouble();
                
                itung.kali(x,y);
                break;
            case 2:
                System.out.print("Masukkan Nilai X= ");
                x=masukan.nextDouble();
                System.out.print("Masukkan Y= ");
                y=masukan.nextDouble();
                itung.bagi(x, y);
            break;
        }
        } 
        catch (Exception e) {
            System.out.println("Masukkan angka");
        }
       
//        itung.kurang(a,b);
//        itung.kali(a, b);
//        itung.bagi(a, b);
//        System.out.println();
    }
 }
    

