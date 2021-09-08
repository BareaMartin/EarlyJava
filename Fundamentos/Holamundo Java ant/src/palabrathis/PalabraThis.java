package palabrathis;

public class PalabraThis {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona1);
        System.out.println("persona nombre: " + persona1.nombre);
        System.out.println("persona apellitdo: " + persona1.apellido);
    }
}

class Persona {
    
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    public void imprimir(Persona persona1) {
        
        System.out.println("persona desde imprimir " + persona1);
        System.out.println("persona desde imprimir " + this);
    }
}
