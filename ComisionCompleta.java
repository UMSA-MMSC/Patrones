package com.mycompany;

public class ComisionCompleta implements ComisionSrategy {
    @Override
    public double miComision(double monto) {
        return monto * 0.50d;
    }
}
