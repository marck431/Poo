package co.com.Poo.test;

import co.com.Poo.herencia.Cliente;
import co.com.Poo.herencia.Empleado;
import co.com.Poo.herencia.Persona;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Alex", 3000);
        System.out.println(empleado);

        Empleado empleado1 = new Empleado("Joel", 4000);
        System.out.println(empleado1);

        Empleado empleado2 = new Empleado("Juan", 5000);
        System.out.println(empleado2);

        var fecha = new Date();
        Cliente cliente =  new Cliente("Alex",'M',25,"Barranquilla",fecha,true);
        System.out.println(cliente);
    }
}
