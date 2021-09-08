package Ejercicios;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecutando constructor vacío.");
    }

    public Caja(int ancho, int alto, int profundo) {
        System.out.println("Constructor con argumentos ejecutado");
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
                
    }

    public int calcularVolumen() {
        int volumen = ancho * alto * profundo;
        System.out.println("volumen = " + volumen);
        return volumen;

    }

}
