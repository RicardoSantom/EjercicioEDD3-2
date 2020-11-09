/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 *it contains the data of the trinagle and allows us to calculate it's area
 * @author David Aparicio Sir
 */
public class Triangle {
    private float base;

   
    private float height; 
    public Triangle() {
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }
    
/**
 * This function returns the area of ​​the triangle
 * @return 
 */
    public float calculateArea(){
        return (height/2)*base;
    }
    
    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
}
