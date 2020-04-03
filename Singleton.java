package com.mycompany;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moises
 */
public class Singleton {

    private static Singleton INSTANCE;
    private static final String Information = "Inicial";

    public static void setINSTANCE(Singleton INSTANCE) {
        Singleton.INSTANCE = INSTANCE;
    }
    
    private Singleton() {        
    }
    
    public String getInformation() {
        return Information;
    }
       
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
}

