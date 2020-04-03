package com.mycompany;

public class ComisionNormal implements ComisionSrategy {
    @Override
    public double miComision(double monto) {
        return monto * 0.30;
    }
}
