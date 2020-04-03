package com.mycompany;


import java.util.ArrayList;
import java.util.List;

public class EmpleadoGerente implements Empleado {

    private List<Empleado> empleados = new ArrayList<>();
    private String nombre;

    public EmpleadoGerente(String name) {
        this.nombre = name;
    }

    @Override
    public List<Empleado> getEmpleado() {
        return this.empleados;
    }

    @Override
    public void add(Empleado e) {
        if (e != null) {
            this.empleados.add(e);
        }
    }

    @Override
    public void remove(Empleado e) {
        if (e != null) {
            this.empleados.remove(e);
        }
    }

    @Override
    public int obtienePuntos() {
        if (this.empleados.isEmpty()) {
            return 0;
        }
        return Math.round(this.empleados.stream().mapToInt(e -> {
            System.out.println(e);
            return e.obtienePuntos();
        }).sum());
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

}
