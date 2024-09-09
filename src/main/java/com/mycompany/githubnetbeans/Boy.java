/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubnetbeans;

/**
 *
 * @author Lenovo
 */
public class Boy extends Person {
    
    private boolean playingFootball;

    public Boy() {
        System.out.println("Hey");// da hwa el default constructor bs i write it ;
    }

   

    public Boy(boolean playingFootball, String name) {
        super(name);
        this.playingFootball = playingFootball;
    }

    public Boy(boolean playingFootball, String email, float height, String grade) {
        super(email, height, grade);
        this.playingFootball = playingFootball;
    }
   
    
   
    
    
}

