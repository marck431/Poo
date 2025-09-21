package co.com.Poo.clases;

public class Rectangulos {
    public int base;
    public int altura;

    public Rectangulos() {
        System.out.println(base);
        System.out.println(altura);
    }

    public int area(int b, int a) {
        base = b;
        altura = a;
        return base * altura;

    }

    public int perimetro(int b, int a) {
        base = b;
        altura = a;
        return 2 * (base + altura);
    }

}
