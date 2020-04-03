package com.mycompany;

public class ComisionRegular implements ComisionSrategy {
    @Override
    public double miComision(double monto) {
        return monto * 0.10;
    }
}
