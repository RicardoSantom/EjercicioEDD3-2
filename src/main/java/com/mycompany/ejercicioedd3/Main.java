/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;

/**
 * Calculate the area of the triangle
 *
 * @author David Aparicio Sir
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle Triangle = new Triangle();
       
        System.out.println("Cual es la altura del triangulo");
        Scanner scanner = new Scanner(System.in);
        Triangle.setHeight(scanner.nextFloat());

        System.out.println("Cual es la base del triangulo");
        scanner = new Scanner(System.in);
        Triangle.setBase(scanner.nextFloat());
        
        float area = Triangle.calculateArea();
        System.out.println("El area del triangulo es " + area);
       
        float fixedHeight = 5;
        float fixedBase = 4;
        
        Triangle fixedTriangle = new Triangle(fixedBase, fixedHeight);
        System.out.println("El area del triangulo fijado es " + fixedTriangle.calculateArea());
    }

}
