package com.mycompany;

import java.util.List;
import java.util.Random;

public class EmpleadoDependiente implements Empleado {

    private String nombre;

    public EmpleadoDependiente(String name) {
        this.nombre = name;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void add(Empleado e) {
        // nothing to implement
    }

    @Override
    public void remove(Empleado e) {
        // nothing to implement
    }

    @Override
    public List<Empleado> getEmpleado() {
        // nothing to implement
        return null;
    }

    @Override
    public int obtienePuntos() {
        return new Random().nextInt(10);
    }

    @Override
    public String toString() {
        return "Yo soy " + getNombre() + ", Dependiente";
    }

}
