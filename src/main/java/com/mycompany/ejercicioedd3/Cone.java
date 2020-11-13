/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 * This function returns the area of a cone 
 * @author David Aparicio Sir
 */
public class Cone {
    //Here I'm going to define 2 variables that are radio and height
    private float radio;
    private float height;
    
//constructor Cone  empty
    public Cone() {
        
    }
//Constructor Cone with radio and height
    public Cone(float radio, float height) {
        this.radio = radio;
        this.height = height;
    }
    
//Getter radio
    public float getRadio() {
        return radio;
    }
//Setter radio
    public void setRadio(float radio) {
        this.radio = radio;
    }
//Getter height
    public float getHeight() {
        return height;
    }
//Setter height
    public void setHeight(float heigth) {
        this.height = heigth;
    }
    //The method to claculate the cone's volume
    public float calculateVolume(){
    return (float) ((Math.PI*(radio*radio)*height)/3);
    }
}
