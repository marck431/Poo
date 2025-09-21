package co.com.Poo;

import co.com.Poo.clases.Calculadora;
import co.com.Poo.clases.Persona;
import co.com.Poo.clases.Rectangulos;

public class Main {
    public static void main(String[] args) {
        // objeto();
        //calculadora();
        //objeto2();
        rectangulo();

    }

    public static void calculadora() {
        System.out.println(Calculadora.PI);

        System.out.println(Calculadora.sumar(40, 50));
    }

    public static void objeto() {
        //instanciando la clase persona
        Persona persona1;
        persona1 = new Persona();

        persona1.nombre = "Alex";
        persona1.edad = 25;
        persona1.mostrarDatos();

        Persona persona2 = new Persona();
        persona2.nombre = "Roel";
        persona2.edad = 24;
        persona2.mostrarDatos();

    }

    public static void objeto2() {
        //instanciando la clase persona
        Persona persona1;
        persona1 = new Persona();

        Persona persona2 = new Persona("Marcos");

    }
    public static void  rectangulo(){
        Rectangulos r1 = new Rectangulos();
        System.out.println(r1.area(8, 4));
    }

}