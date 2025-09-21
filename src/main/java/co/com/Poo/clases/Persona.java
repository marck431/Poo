package co.com.Poo.clases;

public class Persona {
    //atributos
    public String nombre;
    public int edad;


    public Persona() {
        System.out.println("hola");
    }

    public Persona(String nombre) {
        System.out.println("Tu nombre es: " + nombre);
    }

    //metodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
