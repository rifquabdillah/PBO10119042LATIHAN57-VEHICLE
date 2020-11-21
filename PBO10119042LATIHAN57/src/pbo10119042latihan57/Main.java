/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan57;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * Kelas    : IF-1
 * NIM      : 10119042 
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle oo1 = new Bicycle();
        oo1.setBrand("Trek Bike");
        oo1.setModel("7.4FX");
        System.out.println("Brand : " + oo1.getBrand());
        System.out.println("Model : " + oo1.getModel());
        oo1.setGearCount(23);
        System.out.println("Jumlah Gear : " + oo1.getGearCount());
        
        System.out.println();
        
        Skateboard oo2 = new Skateboard();
        oo2.setBrand("Ally Skate");
        oo2.setModel("Rocket");
        System.out.println("Brand : " + oo2.getBrand());
        System.out.println("Model : " + oo2.getModel());
        oo2.setBoardLength(54.5);
        System.out.println("Panjangnya board : " + oo2.getBoardLeght());
    }
    
}
