/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubnetbeans;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String name ;
    String email;
    private int age ;
    private float height;
    private String grade ;
   
  public Person(){
      System.out.println("preson constructor");
  }
   
    public Person (String name ){
        
    }

    public Person(String email, float height, String grade) {
        this.email = email;
        this.height = height;
        this.grade = grade;
    }
    
    
    
    public void eat(){
        
        System.out.print("I am eating");
        
    }
    public String talk(){
        return " Hello, thet is me ." ;
    }
    
    
}
 