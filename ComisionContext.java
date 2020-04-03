package com.mycompany;

public class ComisionContext {

    private ComisionSrategy pagoStrategy;

    public ComisionContext(ComisionSrategy pagoStrategy){
        this.pagoStrategy = pagoStrategy;
    }

    public double executeStrategy(double monto){
        return pagoStrategy.miComision(monto);
    }
}
