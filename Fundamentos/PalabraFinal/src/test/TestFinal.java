package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        //Persona.MI_CONSTANTE
        System.out.println("MI_CONSTANTE = " + Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
        // persona1 = new Persona(); no se le puede asignar un nuevo objeto, si cambiarlo
        persona1.setNombre("Juan");
        System.out.println("persona1.getNombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1.getNombre = " + persona1.getNombre());

    }
}
