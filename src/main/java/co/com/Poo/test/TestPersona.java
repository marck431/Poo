package co.com.Poo.test;

import co.com.Poo.encapsulamiento.*;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alex", 25, false);
        System.out.println(persona1.getNombre());
        persona1.setNombre("Alex Roel");
        System.out.println(persona1);
    }
}
