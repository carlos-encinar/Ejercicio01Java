package com.ufv.ejemplo01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        p.setNombre( sc.nextLine() );

        System.out.println("Escribe tu apellidos: ");
        p.setApellidos( sc.nextLine() );

        System.out.println("Escribe tu DNI sin letra: ");
        p.setDni( sc.nextInt() );

        System.out.println("Escribe tu edad: ");
        p.setEdad( sc.nextInt() );

        System.out.println("Buenos días " + p.getNombre() + p.getApellidos() );
        System.out.println("Según la BBDD, tu dni es:" + p.getDni() + "y tienes " + p.getEdad() + "años." );
    }
}
