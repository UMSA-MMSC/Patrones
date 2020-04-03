package com.mycompany;

import java.util.List;

public interface Empleado {

    String getNombre();

    void add(Empleado e);

    void remove(Empleado e);

    List<Empleado> getEmpleado();

    int obtienePuntos();

}
