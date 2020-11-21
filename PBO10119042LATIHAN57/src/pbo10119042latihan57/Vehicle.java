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
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel = model;
    }
}
