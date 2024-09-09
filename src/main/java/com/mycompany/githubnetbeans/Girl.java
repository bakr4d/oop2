/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubnetbeans;

/**
 *
 * @author Lenovo
 */
public class Girl extends Person{
    
            private boolean shy;

    public Girl(boolean shy, String email, float height, String grade) {
        super(email, height, grade);
        this.shy = shy;
    }
            
    public void eat(){
        
        
        System.out.println("I am eating");
        
    }
    @Override
    public String talk() {
      
         return " I am  a girl .";

    }

    
}
