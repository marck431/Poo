package co.com.Poo.test;

import co.com.Poo.interfaces.BaseDatos;
import co.com.Poo.interfaces.ImplementarMySQL;

public class TestInterfaces {
    public static void main(String[] args) {
        BaseDatos datos = new ImplementarMySQL();
        datos.insertar();
    }
}
